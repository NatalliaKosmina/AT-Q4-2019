import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TableParsing {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/natatestdb?serverTimezone=UTC";
    private static final String user = "root";
    private static final String password = "123456";
    public static final Connection CONNECTION = getConnection();

    public static void main(String[] args) {
        ParsingHtmlIntoMySQL parsingHtmlPages = new ParsingHtmlIntoMySQL();
        String initialUrl = "https://baraholka.onliner.by/viewforum.php?f=63&start=";
        for (int i = 0; i < 451; i+=50){
            String tempUrl = initialUrl;
            tempUrl+=i;
            parsingHtmlPages.tryToParse(tempUrl);
        }

        MySQLTableIntoCSV mySQLTableIntoCSV = new MySQLTableIntoCSV();
        mySQLTableIntoCSV.transferIntoCSV();
    }

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(DB_URL, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
