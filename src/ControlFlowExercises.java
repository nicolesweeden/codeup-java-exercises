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

//        this is not working, unsure why!
//        int i = 2;
//
//        do {
//            System.out.println(i);
//            i*i;
//        } while (i <= 1000000);

//#1c

//        for(int i = 100; i >= -10; i-=5) {
//            System.out.println(i);
//        }


// Create a for loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.


        for(int i = 2; i <= 1000000; i++) {
            System.out.println(i*i);
        }

    }
    }