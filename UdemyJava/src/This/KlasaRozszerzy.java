package This;


public class KlasaRozszerzy extends KlasaPodstawy {

    int x;
    int y;
    int pole;


    KlasaRozszerzy() {

        System.out.println(" konstruktor z klasy rozszerzonej");


    }

    KlasaRozszerzy(int x) {
        this.x = x;

        System.out.println("konstruktor z klasy rozszerzy z parametrem " + x);

    }

    KlasaRozszerzy(int a, int b) {
        this(a);
        y = b;

        System.out.println("Konstruktor z klasa rozszerzona z dwoma parametrami :" + a + b);
    }

    void metodaKlasy() {

    }

    void metodaZparametrami(int pole) {         //this. przypisuje zmiennej lokalnej danej klasy
        this.pole = pole;                       // uzywany zeby nie wymyslac roznych nazw dla tej samej wartosci


    }

}
