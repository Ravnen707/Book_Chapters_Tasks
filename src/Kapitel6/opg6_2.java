package Kapitel6;

public class opg6_2 {


    public static int sumDigits(long n) {
        int resultat;

        while (true) {

            resultat = (int) (n % 10);
            n = n / 10;
            if (n / 10 == 0) {
                resultat = resultat + (int) n;
                break;
            }


        }
        return resultat;
    }

    static void testMethod() {
        System.out.printf("234 skal give, og det giver %dn%", sumDigits(234));
    }

    public static void main(String[] args) {
        testMethod();
    }
}

