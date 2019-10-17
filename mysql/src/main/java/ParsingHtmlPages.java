import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class ParsingHtmlPages {
    private Document dc;

    public ArrayList<String> tryToParse() {

        try {
            dc = Jsoup.connect("https://baraholka.onliner.by/viewforum.php?f=63&start=0").timeout(3000).get();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Element table = dc.select("table").get(0);
        Elements rows = table.select("tr");

        ArrayList<String> tableList = new ArrayList<String>();

        for (int i = 0; i < rows.select("h2.wraptxt").size(); i++) {
            String temp = (rows.select("h2.wraptxt").get(i).text() + ";" + rows.select("td.cost").get(i).text());
            tableList.add(temp);
        }
        return tableList;
    }
}
