package SkoleOpgaver.Store;
import java.util.Date;


public class Varer {
    double stykpris;
    Date holbarhed;
    boolean kanSælges = true;

    void smidUd() {
        kanSælges = false;
    }
}

