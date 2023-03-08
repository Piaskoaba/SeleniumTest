package ModyfikatoryDostepu;

public class MainPolaStaticFinal {

    public static void main(String[] args) {

        KlasaStaticFinal obiekt = new KlasaStaticFinal();
        obiekt.pole = 10;

        //static pole i metoda

        KlasaStaticFinal.poleStatic = 15;

        obiekt.poleStatic = 123;

        System.out.println("KlasaStaticFinal.pole.Static: " + KlasaStaticFinal.poleStatic);


        KlasaStaticFinal.metodaStatyczna();



        //final                     // raz zadeklarowana wartosc nie moze zostac zmieniona

        System.out.println(obiekt.poleFinal);

        //static final
        System.out.println(KlasaStaticFinal.JAKIS_TEKST);       //przydaje sie przy wartosciach niezmiennych np. liczba PI
                                                                //ze statycznej metody nie mozemy odwolac sie do statycznego pola



    }

}