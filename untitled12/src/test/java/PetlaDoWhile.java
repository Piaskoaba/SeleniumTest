import org.junit.jupiter.api.Test;

import java.util.Random;

public class PetlaDoWhile {

    @Test

    public void DoWhile(){
        int silnia5 = 1 * 2 * 3 * 4 * 5;
        int silnia4 = 1 * 2 * 3 * 4;
        int silnia1 = 1;
        int silnia0 = 1;
        int silnia6 = obliczSillnie(6);
        int silnia7 = obliczSillnie(7);
        IsItMy(10);                  //dodane z przykladu
    }

    private int obliczSillnie(int liczba) {
        int silnia = 1;
        int i = 2;

        if (liczba > 1) {

            do{
                silnia = silnia * i;
                i++;

            }

            while (i <= liczba); {       // warunek sprawdzany na poczatku
                silnia = silnia * i;
                i++;

            }
        }
        return silnia;

    }

    private void IsItMy(int liczba) {
        int licznik = 0;
        Random generator = new Random();    //przyklad dzialania petli

        do{         //instrukcaja

            System.out.println(" Number is not equal" + liczba);
            licznik++;
        }

        while (generator.nextInt(11) != liczba);    //warunek
        {
            System.out.println(" Number is not equal" + liczba);
            licznik++;
        }
        System.out.println("Wylosowano moja liczbe. Losowano " + licznik + " razy");
    }
}







