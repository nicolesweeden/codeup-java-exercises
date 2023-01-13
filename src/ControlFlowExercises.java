import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//#1a
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);
//#1b
//        int i = 0;
//
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//        int i = 100;
//        do {
//            System.out.println(i);
//            i= i-5;
//        } while (i >= -10);

//
//        long i = 2;
//
//        do {
//            System.out.println(i);
//            i= i*i;
//        } while (i <= 1000000);

//#1c Refactor the previous two exercises using a for loop.

//Create a for loop that will count backwards by 5's starting with 100 and ending at -10. Follow each number with a new line.
//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }

// Create a for loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.

//        for(long i = 2; i <= 1000000; i=i*i) {
//            System.out.println(i);
//        }

//#2 Fizzbuzz - Write a program that prints the numbers from 1 to 100.
        /* For multiples of three: print “Fizz” instead of the number.
        For the multiples of five: print “Buzz”.
        For numbers which are multiples of both three and five: print “FizzBuzz”. */

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


//#3 Display a table of powers.
        //Prompt the user to enter an integer.
        //Display a table of squares and cubes from 1 to the value entered.
        //Ask if the user wants to continue.
        //Assume that the user will enter valid data.
        //Only continue if the user agrees to.





/*#4 Convert given number grades into letter grades.
Prompt the user for a numerical grade from 0 to 100.
Display the corresponding letter grade.
Prompt the user to continue.
Assume that the user will enter valid integers for the grades.
The application should only continue if the user agrees to.
Grade Ranges:

A : 100 - 88
B : 87 - 80
C : 79 - 67
D : 66 - 60
F : 59 - 0 */

        Scanner scan = new Scanner(System.in);
        System.out.println("\nEnter a numerical grade from 0 to 100: ");
        int userInput = scan.nextInt();

        if (userInput >= 88) {
            System.out.println("Your letter grade is A");
        } else if (userInput >= 80) {
            System.out.println("Your letter grade is B");
        } else if (userInput >= 79) {
            System.out.println("Your letter grade is C");
        } else if (userInput >= 66) {
            System.out.println("Your letter grade is D");
        } else {
            System.out.println("Your letter grade is F");
        }

        System.out.println("Would you like to continue entering numerical grades? {Y/N}");
        String contInput = scan.nextLine();
        boolean cont;

        if (contInput.equalsIgnoreCase("Y")) {
            cont = true;
        } else {
            cont = false;
        }

        scan.nextLine();

}//end main
}//end ControlFlowExercises