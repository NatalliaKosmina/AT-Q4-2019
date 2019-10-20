import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class ParsingHtmlIntoMySQL {
    private Document dc;
    private static Statement statement;

    public void tryToParse(String baseURL) {

        try {
            dc = Jsoup.connect(baseURL).timeout(3000).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element table = dc.select("table").get(0);
        Elements rows = table.select("tr");


        for (int i = 0; i < rows.select("h2.wraptxt").size(); i++) {
            String urlTemp = rows.select("h2.wraptxt").get(i).child(0).attr("href");

            String url = "https://baraholka.onliner.by" + urlTemp.replaceFirst(".", "");

            String cost = rows.select("td.cost").get(i).text().split(" ")[0].replace(",", ".");
            double price;
            if (cost.equals("")) {
                price = 0.0;
            } else {
                price = Double.parseDouble(cost);
            }
            System.out.println(url);

            String query = "INSERT INTO natatestdb.onliner_db (title, url, price, created_at, updated_at) \n" +
                    "VALUES ('" + rows.select("h2.wraptxt").get(i).text() + "', " + "'" + url +
                    "', " + price + ", " + "CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);";
            System.out.println(query);
            try {

                Connection connection = TableParsing.CONNECTION;
                statement = connection.createStatement();
                statement.executeUpdate(query);
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
