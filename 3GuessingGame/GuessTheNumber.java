package guess.the.number;

import java.util.Scanner;

public class GuessTheNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be guessed");
        System.out.println("Range should be 1-1000");
        //puting guessnumber
        int gnumber = sc.nextInt();
        int counter = 0;

        do {
            System.out.println("Guess the number");
            int number = sc.nextInt();
            //guessing
            if (gnumber == number) {
                System.out.println("Correct");
                break;
            } else if (gnumber % 2 == 0) {
                if (number > gnumber) {
                    System.out.println("HINT: The number is even and lower");
                } else if (number < gnumber) {
                    System.out.println("HINT: The number is even and higher");
                }
            } else if (gnumber % 2 != 0) {
                if (number > gnumber) {
                    System.out.println("HINT: The number is odd and lower");
                } else if (number > gnumber) {
                    System.out.println("HINT: The number is odd and higher");
                }
            } else {
                System.out.println("HINT: Invalid Number");
            }
            counter++;

        } while (counter > 0);

    }
}
