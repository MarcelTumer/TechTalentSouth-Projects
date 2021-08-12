package com.ttscalculator;

import java.util.Scanner;





public class Main {



    public static void main(String[] args) {
	// write your code here
        System.out.println("Java Calculator :)");

        int num1;
        int num2;
        int ans;



        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        num1 = input.nextInt();

        System.out.println("Enter number");
        num2 = input.nextInt();

        int choose;
        System.out.println("Choose operator");
        choose = input.nextInt();

        switch (choose){
            case 1:
                System.out.println(add( num1,num2));
                break;
            case 2:
                System.out.println(sub( num1,num2));
                break;
            case 3:
                System.out.println(mult( num1,num2));
                break;
            case 4:
                System.out.println(div( num1,num2));
                break;
            case 5:
                System.out.println(square( num1,num2));
                break;

        }
        }

    private static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
    private static int sub(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }
    private static int mult(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }
    private static int div(int num1, int num2) {
        int result = num1 / num2;
        return result;
    }
    private static int square(int num1, int num2) {
        int result = square(num1,num2);
        return result;
    }
}