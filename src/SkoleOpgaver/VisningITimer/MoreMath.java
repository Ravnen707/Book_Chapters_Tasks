package SkoleOpgaver.VisningITimer;

import java.util.Scanner;

public class MoreMath {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Input something...");

        double input1 = input.nextDouble();

        double ceil = Math.ceil(input1);
        double floor = Math.floor(input1);
        double rint = Math.rint(input1);
        double round = Math.round(input1);

        System.out.println("ceil = " + ceil);
        System.out.println("floor = " + floor);
        System.out.println("rint = " + rint);
        System.out.println("round = " + round);
    }

}
