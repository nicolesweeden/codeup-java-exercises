import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//#1a
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.%n", pi);
//
////#1b
        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter an integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("You entered: " + userInput);
//
////#2b
//        new Scanner(System.in);
//
//        System.out.print("Enter three words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println("You entered: " + userInput1 + ", " + userInput2 + ", " + userInput3 + ".");

//#3b
//        new Scanner(System.in);
//
//        System.out.print("Enter a sentence: ");
//        String userInputSentence = scanner.nextLine();
//
//        System.out.println("You entered: " + userInputSentence + ".");

//Calculate the perimeter and area of Codeup's classrooms.
//#1
    new Scanner(System.in);

        System.out.print("Enter the length in feet of a room to calculate it's dimensions: ");
        String userInputLength = scanner.nextLine();
        System.out.print("Enter the width in feet of a room to calculate it's dimensions: ");
        String userInputWidth = scanner.nextLine();
        int l = Integer.parseInt(userInputLength);
        int w = Integer.parseInt(userInputWidth);
        System.out.println("You entered " + l + " feet for the length " + "and " + w + " feet for the width. The perimeter of your room is " + (2*l + 2*w) + " feet.");
        System.out.println("The area of your room is " + (l*w) + " ft^2.");
    }
}
