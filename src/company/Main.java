package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String playAgain = "";
        do {
            int theNumber = (int) (Math.random() * 100 + 1);
            int guess = 0;
            while (guess != theNumber) {
                System.out.print("Guess a number between 1 and 100: ");
                guess = in.nextInt();
                if (guess < theNumber) {
                    System.out.println(guess + " is too low. Try again.");
                } else if (guess > theNumber) {
                    System.out.println(guess + " is too high. Try again.");
                } else {
                    System.out.println(guess + " is correct. You win!!!");
                    System.out.println("Would you like to play again y/n?");
                    playAgain = in.next();
                }
            }
        }while (playAgain.equalsIgnoreCase("y")) ;
    }
}
