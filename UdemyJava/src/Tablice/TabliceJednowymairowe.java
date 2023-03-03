package Tablice;

public class TabliceJednowymairowe {
    public static void main(String[] args) {

        int[] table;                //deklaracja tablicy
        table = new int[10];        // np.10 rozmiar tablicy
        table [0] = 1;                  //table [indeks]
        table [1] = 22;
        table [2] = 73;
        table [3] = 155;             //do tablicy, pozycja 3 przypisana wartosc 155 (tablice liczone od 0!! 1 element  = nr 0 tj.3 odnosi sie do 4 miejsca

        System.out.println(table[5]);       // bez zadeklarowanej wartosci = wartosc domyslna


        double [] tableDouble = new double [77];

        tableDouble [0] = 12.5;
        tableDouble [1] = 77.3;
        tableDouble [2] = 20.31;
        tableDouble [3] = 31.21;
        tableDouble [4] = 88.76;


        int [] intTable = new int [] {1, 22 ,76, 45, 87};   // skrocony zapis
        System.out.println(intTable[4]);



        int [] intTable2 = {1, 22 ,76, 45, 87};         // skrocony zapis v2
        System.out.println(intTable2[2]);


        System.out.println("tab1 rozmiar : " + intTable.length);        //,length sprawdzenie rozmiaru tablicy
        System.out.println("tab1 rozmiar : " + tableDouble.length);

    }
}
