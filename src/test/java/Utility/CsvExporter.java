package Utility;

import com.opencsv.CSVWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.sql.ResultSet;
public class CsvExporter {
    public static void exportResults(ResultSet myResults, String fileName){
        try {
            //CSVWriter writer = new CSVWriter(new FileWriter("target/"+fileName+".csv"), ',');
            CSVWriter writer = new CSVWriter(
                    new OutputStreamWriter(new FileOutputStream("target/"+fileName+".csv"), StandardCharsets.UTF_8),
                    ',',
                    CSVWriter.DEFAULT_QUOTE_CHARACTER,
                    CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                    CSVWriter.DEFAULT_LINE_END
            );
            boolean includeHeaders = true;
            writer.writeAll(myResults, includeHeaders);
            writer.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
/*
<dependency>
<groupId>com.opencsv</groupId>
<artifactId>opencsv</artifactId>
<version>4.0</version>
</dependency>*/
