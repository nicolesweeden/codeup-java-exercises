import java.util.Scanner;

public class MethodsExercises {

    //1a-1d
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        int sum = a + b;
        int difference = a - b;
        int quotient = a / b;
        int product = a * b;
        int modulus = a % b;

        System.out.println("The sum of adding (a) and (b) is: " + sum);
        System.out.println("The difference between (a) minus (b) is: " + difference);
        System.out.println("The quotient of (a) divided by (b) is: " + quotient);
        System.out.println("The product of (a) times (b) is: " + product);
        System.out.println("The remainder after dividing (a) by (b) is: " + modulus);

    //2
        public static int getInteger ( int min, int max){ //Provided
            Scanner myObj = new Scanner(System.in);  // Creating a Scanner object
            System.out.print("Enter a number between 1 and 10: "); //Provided
            int userInput = getInteger(1, 10); //Provided
//        String userInput = myObj.nextLine();  // Read user input

            if (min >= 3 && max >= 5) {
                System.out.println("That is within the correct range!");
                return 5;
            } else {
                System.out.println("Enter a number between 1 and 10: ");
            }
            ;

        }//end main
    }




