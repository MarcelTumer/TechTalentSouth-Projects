package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = userInput.nextLine();
        System.out.println("Give me an adverb: ");
        String adverb = userInput.nextLine();
        System.out.println("Give me an adjective: ");
        String adjective = userInput.nextLine();
        System.out.println("Give me a noun: ");
        String noun = userInput.nextLine();
        System.out.println("Give me another noun: ");
        String nounTwo = userInput.nextLine();
        System.out.println("Give me a number: ");
        String number = userInput.nextLine();
        System.out.println("Name your school ");
        //String yourName = userInput.nextLine();

        System.out.printf("Hello \n");
        System.out.printf("\n Dear %s,", name);
        System.out.printf("\n You are %s %s and you are at the top of your %s!", adverb, adjective, noun);
        System.out.printf("\n You have won a trip to the %s that is eligible for %s days.", nounTwo, number);
        System.out.printf("\n Sincerely, %s \n", yourName);
    }
}
