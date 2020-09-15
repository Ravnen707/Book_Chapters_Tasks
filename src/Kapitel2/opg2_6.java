package Kapitel2;

import java.util.Scanner;

public class opg2_6 {
    public static void main(String[] args) {
    System.out.println("Put in a number between 0 and 1000");
        Scanner input = new Scanner(System.in);
        int Nr = Integer.parseInt(input.next());

        if (Nr > 0 & Nr < 1000) {
            if (Nr < 10) {
                System.out.println(Nr);
                System.exit(0);
            }
            else if (Nr >= 10 & Nr < 1000) {
                int Digit = Nr % 10;
                int NyNr = Nr / 10;
                int Digit1 = NyNr % 10;
                System.out.println(Digit * Digit1);
                System.exit(0);
            }
            else if (Nr >= 100 & Nr < 1000){
                int Digit =  Nr % 10 ;
                int NyNr = Nr / 10;
                int digit1 = NyNr % 10 ;
                int NyNr2 = NyNr / 10;
                int Digit2 =  NyNr2 % 10 ;
                System.out.print(Digit * digit1 * Digit2);
                System.exit(0);
            }
        }else System.out.println("Either too small or too big");
        System.exit(0);
    }
}
