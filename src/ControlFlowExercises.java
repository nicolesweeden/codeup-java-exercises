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
            if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0 && i % 5 == 0) { //I am not getting fizzbuzz, just fizz
                System.out.println("FizzBuzz");
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




    }//end main
}//end ControlFlowExercises