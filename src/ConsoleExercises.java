import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//#1a
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

//#1b
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.println("You entered: " + userInput);

//#2b
        new Scanner(System.in);

        System.out.print("Enter three words: ");
        String userInput1 = scanner.next();
        String userInput2 = scanner.next();
        String userInput3 = scanner.next();

        System.out.println("You entered: " + userInput1 + ", " + userInput2 + ", " + userInput3 + ".");

//#3b
        new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String userInputSentence = scanner.next();

        System.out.println("You entered: " + userInputSentence + ".");

}
}
