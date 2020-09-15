package Kapitel2;

import java.util.Scanner;

public class opg2_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Miles to be converted?");
        double Km;
        Km = 1.6;
        double miles = input.nextDouble();

        System.out.println("results= " + Km * miles);
    }
}
