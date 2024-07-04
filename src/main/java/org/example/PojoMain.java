package org.example;
import com.opencsv.bean.CsvToBeanBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {

            FileReader reader = new FileReader("C:/Users/HP USER/OneDrive/Desktop/open.csv");


            List<CSVUser> users = new CsvToBeanBuilder<CSVUser>(reader)
                    .withType(CSVUser.class)
                    .build()
                    .parse();

            for (CSVUser user : users) {
                System.out.println(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
