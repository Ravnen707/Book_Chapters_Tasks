package Kapitel2;

import java.util.Scanner;

public class opg2_3 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("meters to be converted?");
            double feet;
            feet = 3.2786;
            double meters = input.nextDouble();

            System.out.println("feets: " + feet * meters);
        }
    }

