package SkoleOpgaver.Watches;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        System.out.println("       Multiplication Table");

        System.out.println("    ");
        for (int j = 1; j <= 9; j++)
        System.out.println("    " + j);

        System.out.println("");

        for (int i = 1; i <= 99; i++) {
            System.out.println("   " + i);
            for (int j = 1; j <= 99; j++) {
     //           System.out.println("%6d", i*j);

            }
            System.out.println();
        }
    }
}
