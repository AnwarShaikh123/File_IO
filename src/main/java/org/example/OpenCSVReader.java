package org.example;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

public class OpenCSVReader {
    static String path="C:/Users/HP USER/OneDrive/Desktop/open.csv";

    public static void main(String[] args)throws IOException {
        try (
            Reader reader= Files.newBufferedReader(Paths.get(path));
            CSVReader csvReader=new CSVReader(reader);
        ) {
            String[] nextRecord;
            while ( ( nextRecord = csvReader. readNext( )) !=null){
                System.out.println("Name: " +nextRecord[0]);
                System.out.println("Email" +nextRecord[1]);
                System.out.println("phone" +nextRecord[2]);
                System.out.println("Country" +nextRecord[3]);

            }
        } catch (CsvValidationException e) {
            throw new RuntimeException(e);
        }

    }
}
