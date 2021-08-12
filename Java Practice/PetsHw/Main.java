package com.techtalhw;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Pet Classification");
        System.out.println();
        Pet petOne = new Pet(
                "Pancake",
                12,
                "United States",
                "Chihuahua");
        System.out.println();
        Pet petTwo = new Pet(
                "Waffles",
                8,
                "Germany",
                "Spaniel");
        System.out.println();
        Pet petThree = new Pet(
                "Maple",
                9,
                "Canada",
                "Husky");
        System.out.println();
        System.out.println("Pet 1");
        System.out.println(petOne.name);
        System.out.println(petOne.age);
        System.out.println(petOne.location);
        System.out.println(petOne.type);
        System.out.println();
        System.out.println("Pet 2");
        System.out.println(petTwo.name);
        System.out.println(petTwo.age);
        System.out.println(petTwo.location);
        System.out.println(petTwo.type);
        System.out.println();
        System.out.println("Pet 3");
        System.out.println(petThree.name);
        System.out.println(petThree.age);
        System.out.println(petThree.location);
        System.out.println(petThree.type);
        System.out.println();

    }
    static class Pet {
        String name;
        int age;
        String location;
        String type;

        Pet(String name, int age, String location, String type) {
            this.name = name;
            this.age = age;
            this.location = location;
            this.type = type;

        }

    }
}
