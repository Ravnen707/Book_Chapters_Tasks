package SkoleOpgaver;

public class IfSætninger {
    public static void main(String[] args) {
        int time = 10;
        if (time < 8) {
            System.out.println("good morning");
        } else if (time < 12) {
            System.out.println("good day");
        } else {
            System.out.println("Good evening");

        }
    }
}
/*
"if/Else if/ else.
It work like this:
If the time is less than 8 it's "Good morning"
but
if we make the time greater than 8 but less than 10 it's "Good day".
So
if we ake the time greater than both of 'em it's "Good evening"
 */