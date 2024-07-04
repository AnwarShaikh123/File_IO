package org.example;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;


public class WriteToCsv {
    public static void main(String[] args) throws IOException {
        CSVWriter write= new CSVWriter(new FileWriter("C:/Users/HP USER/OneDrive/Desktop/Data.csv"));

        String set1[]={"name","country","dept"};
        String set2[]={"Anwar","India", "IT"};
        String set3[]={"Raj","India", "Sales"};

        write.writeNext(set1);
        write.writeNext(set2);
        write.writeNext(set3);

        write.flush();

        System.out.println("Data Entered Successfully");

    }

}
