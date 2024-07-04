package org.example;

import com.opencsv.bean.CsvBindByName;
    public class CSVUser {
        @CsvBindByName
        String name;

        @CsvBindByName(column = "email")
        String email;

        @CsvBindByName(column = "phone")
        String phone;

        @CsvBindByName
        String country;

        @Override
        public String toString() {
            return "CSVUser{" +
                    "name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", country='" + country + '\'' +
                    '}';
        }
    }

