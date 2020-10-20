package SkoleOpgaver.Watches;

public class watches {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) continue;;
            System.out.println("summen er " +number +" mindre end summen af 100.");
        }
        System.out.println("Summen er større end 100!");
    }

}
