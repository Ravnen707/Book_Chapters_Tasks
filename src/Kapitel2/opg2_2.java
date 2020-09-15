package Kapitel2;

import java.util.Scanner;

public class opg2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for length: ");
        double length = Double.parseDouble(input.next());
        double areal = (Math.sqrt(3)/4) * Math.pow(length, 2);
        System.out.println(areal * length);

    }

    }
