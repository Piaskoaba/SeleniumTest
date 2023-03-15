package ENUM;

public class MainEnum {

    public static void main(String args[]) {

        KierunekSwiata kierunek = KierunekSwiata.ZACHOD;
        System.out.println(kierunek);

        if (kierunek == KierunekSwiata.POLNOC) {
            System.out.println("poszedl na polnoc: ");
        } else if (kierunek == KierunekSwiata.POLUDNIE) {
            System.out.println("poszedl na południe ");

        } else if (kierunek == KierunekSwiata.WSCHOD) {
            System.out.println("poszedl na wschod ");
        } else if (kierunek == KierunekSwiata.ZACHOD) {
            System.out.println("poszedl na zachod ");
        } else {
            System.out.println(" Cos poszlo nie tak. Wybrales zly kierunek ");

        }


        switch (kierunek) {
            case POLNOC:
                System.out.println("poszedl na polnoc: ");
            case WSCHOD:
                System.out.println("poszedl na wschod ");
                break;
            case ZACHOD:
                System.out.println("poszedl na zachod ");
                break;

            case POLUDNIE:
                System.out.println("poszedl na południe ");
                break;
            default:
                System.out.println(" Cos poszlo nie tak. Wybrales zly kierunek ");
        }
        //ordinal(), valueOf(),values()
        KierunekSwiata kierunekSwiata = KierunekSwiata.WSCHOD;
        kierunekSwiata.ordinal();           // z string na int
        System.out.println("ordinal: " + kierunekSwiata.ordinal());

        KierunekSwiata kierunekSwiataValueOF = KierunekSwiata.valueOf("WSCHOD");
        System.out.println("valueOF: " + kierunekSwiataValueOF);        // z string na ENUM


        KierunekSwiata[] kierunekSwiataValues = KierunekSwiata.values();   // z int na ENUM

        for (int i = 0; i < kierunekSwiataValues.length; i++) {
            System.out.println("i: " + i + " kierunek" + kierunekSwiataValues[i]);
        }

        KierunekSwiata ks = KierunekSwiata.values()[2];
        System.out.println("values ()[2]" + ks);



        Pizza pizza = Pizza.XXL;
        System.out.println("Zamowiles pizze w rozmiarze: "+ pizza + " " + pizza.pobierzRozmiar());
        System.out.println("Cena: " + pizza.pobierzCene());

        Pizza pizzaDruga = Pizza.DUZA;
        System.out.println("Zamowiles pizze w rozmiarze: "+ pizzaDruga + " " + pizzaDruga.pobierzRozmiar());
        System.out.println("Cena: " + pizzaDruga.pobierzCene());

        float kosztCalosci = pizza.pobierzCene() + pizzaDruga.pobierzCene();
        System.out.println("do zaplaty: " + kosztCalosci);


    }



}
