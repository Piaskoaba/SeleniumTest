package KlasyAbstrakcyjne;

public class KlasaZwykla extends FirstAbstractClass{                //dziedziczac po klasie abstra trzeba zaimplementowac z niej metody
    @Override
    public void metodaAbstrakcyjna() {
        System.out.println("Wypisalem z klasy zwyklej ");
    }

    @Override
    public int metodaZParametrem(String z) {
        System.out.println("Parametr : " + z);
        return 110;
    }
}
