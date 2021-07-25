package com.company;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        HashMap<String, String> carInventory = new HashMap<String,String>();
        carInventory.put("Acura", "MDX");
        carInventory.put("Audi", "A4");
        carInventory.put("BMW", "7-Series");
        carInventory.put("Buick", "Encore");
        carInventory.put("Chevrolet", "Blazer");
        Scanner carType = new Scanner(System.in);
        System.out.println("What car model are you interested in?");
        String myCar = carType.nextLine();
        if (carInventory.containsKey(myCar)) {

            System.out.println("If you're looking for" + myCar + " We have that right over here!");
        } else System.out.println("Sorry we don't have that.");

    }
}
