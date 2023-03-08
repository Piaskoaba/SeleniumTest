package PrzeslanianieOvverrideSuper;

public class KlasaRozszerzona  extends KlasaPodstawowa {
    // @Override                   //w przypadku, gdy w dwoch kalsach znajduje sie metoda o tej samej nazwie, gwarantuje, ze metoda zostanie nadpisana
    // void metoda() {
    //     System.out.println("Printed from secondary Class :");


    @Override
    void metoda() {
        super.metoda();         // super ozn.odniesienie sie do klasy nadrzednej. do klasy po ktorej dziedziczymy
                                // printuje wartosc z klasy nadrzednej oraz z dziedziczacej
        System.out.println(" Wypisany dodatkowy tekst ");
    }
}



