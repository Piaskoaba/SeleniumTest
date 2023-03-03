package Tablice;

public class Zad2TabliceJiD {
    public static void main(String[] args) {

        int[] tablica = {1, 2, 3, 4, 5};
        int wynik = tablica[0] + tablica[1] + tablica[2] + tablica[3] + tablica[4];
        System.out.println(" Suma :" + wynik);

        double[][] tab2 = {
                {1.3, 2.5, 3.4, 14.7, 25.3,},
                {4.8, 8.7, 10.3, 36.7, 25.2,},
                {3.2, 13.1, 21.5, 58.7, 41.9}
        };
        double suma1 =
                tab2[0][0] +
                tab2[0][1] +
                tab2[0][2] +
                tab2[0][3] +
                tab2[0][4];
        System.out.println("Suma1 wynosi : " + suma1);


        double suma2 =
                tab2[1][0] +
                tab2[1][1] +
                tab2[1][2] +
                tab2[1][3] +
                tab2[1][4];
        System.out.println("Suma2 wynosi : " + suma2);

        double suma3 =
                tab2[2][0] +
                tab2[2][1] +
                tab2[2][2] +
                tab2[2][3] +
                tab2[2][4];
        System.out.println("Suma3 wynosi : " + suma3);
    }
}


