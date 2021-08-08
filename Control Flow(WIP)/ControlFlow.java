public class controlFLow {
    public static void main(String args[]) {
        System.out.println("Hello World");
        printNumbers();
        System.out.println();
        printLowerCase();
        System.out.println();
        printUpperCase();

        Scanner question = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String nameInput = question.next();

        System.out.println("Can you answer a few questions? (yes or no)");
        String yayOrNay = question.next();

        if (yayOrNay.equalsIgnoreCase("yes")){
            System.out.println("Proceed");
        } else{
            System.out.println("See you later");
            System.exit(-1);
        }

        String repeat;

        String petName;
        int petAge;
        int luckyNumber;
        int jerseyNumber;
        int carYear;
        int enteredNum;
        String actName;
        do {
            System.out.println("What is your favorite pet's name?");
            petName = question.next();

            System.out.println("How old is " + petName + "?");
            petAge = question.nextInt();

            System.out.println("What is your lucky number?");
            luckyNumber = question.nextInt();

            System.out.println("What is your favorite athlete's jersey number?");
            jerseyNumber = question.nextInt();

            System.out.println("What is the two-digit model year of your car? (For a 2000 year model, enter 00)");
            carYear = question.nextInt();

            System.out.println("Please enter a number between 1 and 50");
            enteredNum = question.nextInt();

            System.out.println("What is your favorite actor/actress's first name?");
            actName = question.next();
            System.out.println();

            System.out.println("Would you like to repeat the questions?(yes or no)");
            repeat = question.next();
        } while (repeat.equalsIgnoreCase("yes"));

        Random randNumGenerator = new Random();

        int random1 = randNumGenerator.nextInt(75);
        int random2 = randNumGenerator.nextInt(65);

        int magicNumber = random1 * jerseyNumber;

        int lottery1 = carYear + luckyNumber;
        int lottery2 = 42;
        int lottery3 = jerseyNumber + petAge + luckyNumber;
        while (lottery3 > 65) {
            lottery3 -= 65;
        }
        int lottery4 = petName.charAt(2);
        int lottery5 = actName.charAt(0);

        while (magicNumber > 75) {
            magicNumber -= 75;
        }

        System.out.println("Lottery Numbers: " + lottery1 + " " + lottery2 + " " + lottery3 + " " + lottery4 + " "
                + lottery5 + " " + "Magic Ball: " + magicNumber);

        question.close();
}
