import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLong;

public class HtmlTable2 {
    public static String DOCTYPE = "<!DOCTYPE HTML>";
    public static String HTML_START = "<html>";
    public static String BODY_START = "<body>";
    public static String BODY_END = "</body>";
    public static String META = "<meta charset=\"utf-8\">";
    public static String HTML_END = "</html>";
    public static String TABLE_START_BORDER = "<table border=\"1\">";
    public static String TABLE_END = "</table>";
    public static String HEADER_START = "<th>";
    public static String HEADER_END = "</th>";
    public static String ROW_START = "<tr>";
    public static String ROW_END = "</tr>";
    public static String COLUMN_START = "<td>";
    public static String COLUMN_END = "</td>";

    public static void main(String[] args) {
        String argument = args[0];
        Path path = Paths.get(argument);
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
            PrintWriter writer = new PrintWriter("HTML-Table.html");
            writer.println(DOCTYPE + "\n" + HTML_START + "\n" + META + "\n" + BODY_START + "\n" + TABLE_START_BORDER + "\n" + ROW_START +
                    "\n" + HEADER_START + " ИМЯ " + HEADER_END + "\n" + HEADER_START + " ТИП " + HEADER_END + "\n" + HEADER_START +
                    " ДАТА СОЗДАНИЯ " + HEADER_END + "\n" + HEADER_START + " РАЗМЕР (в Kb) " + HEADER_END + ROW_END);

            for (Path file : stream) {
                BasicFileAttributes atr = Files.readAttributes(file, BasicFileAttributes.class);
                if (Files.isDirectory(file)) {
                    writer.println(ROW_START + "\n" + COLUMN_START + file.getFileName() + COLUMN_END + "\n" + COLUMN_START + " DIR " +
                            COLUMN_END + "\n" + COLUMN_START + new SimpleDateFormat("dd.MM.yyyy").format(atr.creationTime().toMillis()) +
                            COLUMN_END + "\n" + COLUMN_START + (getFolderSize(file) / 1000) + COLUMN_END + "\n" + ROW_END);
                } else {
                    writer.println(ROW_START + "\n" + COLUMN_START + file.getFileName() + COLUMN_END + "\n" + COLUMN_START + " FILE " +
                            COLUMN_END + "\n" + COLUMN_START + new SimpleDateFormat("dd.MM.yyyy").format(atr.creationTime().toMillis()) +
                            COLUMN_END + "\n" + COLUMN_START + ((float)atr.size() / 1000) + COLUMN_END + "\n" + ROW_END + "\n");
                }
            }
            writer.println(TABLE_END + "\n" + BODY_END + "\n" + HTML_END);
            writer.close();
        } catch (IOException | DirectoryIteratorException x) {
            System.err.println("Path is incorrect!");
        }
    }

    static long getFolderSize(Path pathInnerFolder) throws IOException {

        AtomicLong size = new AtomicLong(0);
        Files.walkFileTree(pathInnerFolder, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path folder, BasicFileAttributes attrs)
                    throws IOException {
                size.addAndGet(attrs.size());
                return FileVisitResult.CONTINUE;
            }
        });
        return size.longValue();
    }
}