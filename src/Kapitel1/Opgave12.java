package Kapitel1;

public class Opgave12 {
         public static void main(String[] args) {
            //Giver timer/minutter og sekunder et navn for at gøre udregning mindre "number Heavy"
            double hour = 1;
            double minutes = 40;
            double seconds = 35;
            //Coverter det om her fra miles til Km
            double Km = 24 * 1.6;
            // laver alt tiden om til minutter
            double TimeMins = hour * 60 + minutes + seconds / 60;
            // Udregner Km per time
            double KmPrHour = 60 * Km / TimeMins;

            System.out.println(KmPrHour);
        }
    }
