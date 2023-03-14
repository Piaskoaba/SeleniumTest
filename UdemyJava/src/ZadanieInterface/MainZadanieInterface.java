package ZadanieInterface;

public class MainZadanieInterface {

    public static void main(String[] args) {


        Kolo kolo = new Kolo(4);
        Prostokat prostokat = new Prostokat(4,6);

        System.out.println();

        System.out.println(kolo.obwod());
        System.out.println(kolo.pole());

        System.out.println();


        System.out.println(prostokat.obwod());
        System.out.println(prostokat.pole());




    }
}
