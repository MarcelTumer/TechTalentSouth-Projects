package com.company;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Passport usPassport = new Passport(
                "1234",
                "America",
                LocalDate.of(2025,1,1));
    }
    static class Passport {
        String number;
        String country;
        LocalDate expiryDate;

        Passport(String number, String country, LocalDate expiryDate) {
            this.number = number;
            this.country = country;
            this.expiryDate = expiryDate;
        }
    }
}
