import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLTableIntoCSV {
    public void transferIntoCSV(){
        try {
            PrintWriter printWriter = new PrintWriter(new File("mysql/src/main/resources/files/exportedTable.csv"));
            StringBuilder stringBuilder = new StringBuilder();

            Connection connection = TableParsing.CONNECTION;
            ResultSet resultSet = null;

            String query = "select * from onliner_db";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            resultSet= preparedStatement.executeQuery();

            while (resultSet.next()) {
                stringBuilder.append(resultSet.getString("title"));
                stringBuilder.append(" | ");
                stringBuilder.append(resultSet.getString("url"));
                stringBuilder.append(" | ");
                stringBuilder.append(resultSet.getDouble("price"));
                stringBuilder.append(" | ");
                stringBuilder.append(resultSet.getString("created_at"));
                stringBuilder.append(" | ");
                stringBuilder.append(resultSet.getString("updated_at"));
                stringBuilder.append("\r\n");
            }

            printWriter.write(stringBuilder.toString());
            printWriter.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
