package Kapitel3;

import java.util.Scanner;

public class Listing31 {
    public static void main(String[] args) {
        int number1 = (int) (System.currentTimeMillis() % 100);
        int number2 = (int) (System.currentTimeMillis() / 100 % 100);

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + "? ");

        int answer = input.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
    }
}
