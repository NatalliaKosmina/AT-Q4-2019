import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ImportToCSV {
    private static final String CSV_FILE = "mysql/src/main/resources/files/Catalog.csv";


    public void writeToCSV() {
        BufferedWriter writer = null;
        CSVPrinter csvPrinter = null;
        ParsingHtmlPages parsingPages = new ParsingHtmlPages();
        int arraySize = parsingPages.tryToParse().size();

        try {
            writer = Files.newBufferedWriter(Paths.get(CSV_FILE));
            csvPrinter = new CSVPrinter(writer, CSVFormat.MYSQL.withIgnoreEmptyLines(false));
            for (int i = 0; i < arraySize; i++) {
                csvPrinter.printRecord(parsingPages.tryToParse().get(i));
            }
            csvPrinter.flush();
            writer.close();
        } catch (Exception e) {

        }
    }
}
