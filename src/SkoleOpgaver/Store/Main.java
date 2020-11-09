package SkoleOpgaver.Store;
import java.util.Date;



public class Main {
    public static void main(String[] args) {
        Apple a = new Apple();
        a.stykpris = 2;
        a.holbarhed = new Date(1608768000);
        a.smidUd();
        a.moden = true;
        a.coolDown();

        pærre pæ = new pærre();
        pæ.stykpris = 300;
        pæ.holbarhed = new Date(1608768000);
        pæ.smidUd();
        pæ.moden = true;
        a.coolDown();

        Peas p = new Peas();
        p.stykpris = 0.1;
        p.holbarhed = new Date(1608768000);
        p.freeze();

        Gulerød g = new Gulerød();
        g.stykpris = 5;
        g.holbarhed = new Date(1608768000);
        g.freeze();


    }

}
