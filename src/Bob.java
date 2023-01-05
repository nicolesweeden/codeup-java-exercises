import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//
//        String firstStatement = "We don't need no education.\n" +
//            "We don't need no thought control.";
//            System.out.print(firstStatement);

//Scanner scanner = new Scanner(System.in);
//
//        for (int i=1; i<=100; i++) {
//            if (i%3 == 0 && i%5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i%3 == 0) {
//                System.out.println("Fizz");
//            } else {
//                System.out.println("Buzz");
//            }
//            }



//        if (userInput.endsWith("?")){
//            System.out.println("Sure");
//        } else if (userInput.endsWith("!")) {
//            System.out.println("Whoa, chill out!");
//        } else if (userInput.endsWith("")) {
//            System.out.println("Fine. Be that Way!");
//        } else {
//            System.out.println("Whatever.");
//        }


//        while (true) {
//            System.out.println("Say something to Bob:");
//            if (userInput.endsWith("?")){
//                System.out.println("Sure");
//                System.out.println("Say something to Bob again:");
//            } else if (userInput.endsWith("!")){
//                System.out.println("Whoa, chill out!");
//                System.out.println("Say something to Bob again:");
//            } else if (userInput.endsWith("")){
//                System.out.println("Fine. Be that way!");
//                System.out.println("Say something to Bob again:");
//        } else {
//                System.out.println("Whatever");
//            }
//        }

        Scanner scan = new Scanner(System.in);
        boolean cont;

//        This code worked but only once
        do {
            System.out.println("Say something to Bob:");
            String userInput = scan.nextLine();

            if (userInput.endsWith("?")) {
                System.out.println("Sure");
            } else if (userInput.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userInput.endsWith(" ")) {
                System.out.println("Fine. Be that Way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.println("Would you like to keep talking to Bob? {Y/N}");
            String contInput = scan.nextLine();
            if (contInput.equalsIgnoreCase("Y")) {
                cont = true;
            } else {
                cont = false;
            } scan.nextLine();
        } while (cont);


    }
}