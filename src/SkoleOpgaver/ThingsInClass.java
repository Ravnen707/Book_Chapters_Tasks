package SkoleOpgaver;

public class ThingsInClass {
    public static void main(String[] args) {
        double PI = Math.PI;

        double vinklenRadian = Math.toRadians(100);
        double sinafVinklen = Math.sin(vinklenRadian);
        double cosafVinklen = Math.cos(sinafVinklen);

        for (int i = 0; i < 100; i++) {
            int tal = (int)Math.ceil(Math.random() * 6);
            if (tal < 7) {
                System.out.println("for lille tal");
                switch (tal) {
                    case 1,2,3,4,5,6:
                        System.out.println(tal + " ");
                        break;
                    default:
                        System.out.println("Fejl");
                }
            }

            // fori to have something wrote out between 2 numbers " 0 to 100 times".

        }
    }
}
