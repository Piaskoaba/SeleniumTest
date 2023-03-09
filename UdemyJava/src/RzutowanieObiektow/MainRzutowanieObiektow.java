package RzutowanieObiektow;

public class MainRzutowanieObiektow {
    public static void main(String[] args) {

        Rzutowanie2 rzutowanie2 = new Rzutowanie2();
        rzutowanie2.ustawLiczbe(145);
        rzutowanie2.wyswietlLiczbe();

        Rzutowanie1 rzutowanie1 = (Rzutowanie1) rzutowanie2;   //rzutowanie1 ma referencje do rzutowanie2
        rzutowanie1.wyswietlLiczbe();

    }
}
