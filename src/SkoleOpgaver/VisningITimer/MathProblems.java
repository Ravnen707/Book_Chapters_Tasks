package SkoleOpgaver.VisningITimer;

import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number... than write another one (Another one!)");

        double input2 = input.nextDouble();
        double input3 = input.nextDouble();

        double pow = Math.pow(input2, input3);
        double exp = Math.exp(input2);
        double log = Math.log(input2);
        double log10 = Math.log10(input2);
        double sqrt = Math.sqrt(input2);

        System.out.println("pow = " + pow);
        System.out.println("exp = " + exp);
        System.out.println("log = " + log);
        System.out.println("log10 = " + log10);
        System.out.println("sqrt = " + sqrt);
    }
}
