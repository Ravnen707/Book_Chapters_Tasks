package Kapitel3;

import jdk.jshell.Snippet;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 100); // Generating random numbers

        // making user put in an input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottery pick (2 Digits): ");
        int guess = input.nextInt();

        //digits from lottery
        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        //digit from guess
        int guessDigit1 = lottery / 10;
        int guessDigit2 = lottery % 10;

        System.out.println("The lottery number is " + lottery);

        // checking the guess
        if (guess == lottery)
            System.out.println("Exact match: You win $100.000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: You win $50.000");
        else if (guessDigit1 == lotteryDigit1
              || guessDigit1 == lotteryDigit2
              || guessDigit2 == lotteryDigit1
              || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: You win $10.000");
        else
            System.out.println("Nothing matched");
    }
}

// Program works. checked by making the genrated number only able to reach "0" which makes it able to get an exact
// match. which ends in the $100.000.
