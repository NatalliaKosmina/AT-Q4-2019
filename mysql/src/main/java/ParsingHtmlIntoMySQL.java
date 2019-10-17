import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ParsingHtmlIntoMySQL {
    private static String JDBC_CONNECTION_URL =
            "jdbc:oracle:thin:root@localhost:3306:natatestdb";

    public static void main(String[] args) {
        ImportToCSV importToCSV = new ImportToCSV();
        importToCSV.writeToCSV();

    }

    private static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            connection = DriverManager.getConnection(JDBC_CONNECTION_URL);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
