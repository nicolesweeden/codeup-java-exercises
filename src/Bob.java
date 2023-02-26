import java.util.Scanner;

//commented
public class Bob {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean cont;

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
            }

            scan.nextLine();

        } while (cont);

    }
}