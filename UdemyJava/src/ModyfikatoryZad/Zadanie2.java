package ModyfikatoryZad;

public class Zadanie2 {

    private int[] tablica;

    public Zadanie2(int[] podajTablice) {
        tablica = podajTablice;
    }

   public int suma() {

        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i]; // suma + tablica
        }
        return suma;

    }

   public int srednia() {

        int srednia = suma() / tablica.length;
        return srednia;

    }


   public int min() {

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }

        return max;

    }
}