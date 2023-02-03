import org.junit.jupiter.api.Test;

public class InstrukcjeWarunkowe {
    @Test
    public void ifexample() {
        int liczba = 100;


        if (liczba > 100) {                         //jesli
            System.out.println("Liczba " + liczba + " Jest wieksza od 100");
        liczba++;                   //powieksz o 1
        }
        else if (0<=liczba && liczba <=100){    // w przeciwnym razie, jesli // 0<= i <=100
            System.out.println("Wartosc" + liczba + "Jest mniejsza  lub rowna 100 ");
            if(liczba==100) System.out.println("Wygrales roll! Item for U");
            liczba = 100;
        }
                                //jezeli nie spelni warunkow wyzej, przechodzi do else
        else {                    //w przeciwnym razie
            System.out.println("Liczba " + liczba + " Nie jest  wieksza od 100)");
        }

        System.out.println("Koniec testu. Liczba jest równa " + liczba);
    }

    @Test

    public void switchExample() {
        int liczba = 43;

        switch (liczba) {
            case 0:                //przypadek  //punkt wejscia, spelnil warunek
                System.out.println(" Liczba jest rowna 0 ");
            break;           // przerywa operacje po spelnienia warunku
            case 1:
            System.out.println(" Liczba jest rowna 1 ");
            break;
            case 2:
            System.out.println(" Liczba jest rowna 2" );
            break;
            case 43:
                System.out.println( " Liczba jest równa 43");
            break;
            default:        // jezeli warunki nie sa spełnione
            System.out.println(" Liczba jest nieprawidłowa ");

        }

    }
}


