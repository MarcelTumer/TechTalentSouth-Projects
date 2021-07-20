import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        //this is a comment
        //this is a comment

        //System.out.print("Hello");
        //System.out.print("Goodbye");

        Scanner input = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.printf("Hello %s!\n", firstName, lastName);
        System.out.printf("Goodbye %s!\n", lastName,firstName);


    }
}
