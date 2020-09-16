package Kapitel2;

import java.util.Scanner;

public class opg2_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double Subtotal = Double.parseDouble(input.next());
        double Gratuity = Double.parseDouble(input.next());
        double Procenter = (Subtotal/100) * Gratuity;
        System.out.println(Procenter);
        double Nytotal = (Subtotal + Procenter);
        System.out.println(Nytotal);

    }
}
