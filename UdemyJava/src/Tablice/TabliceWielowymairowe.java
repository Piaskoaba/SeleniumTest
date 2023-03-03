package Tablice;

public class TabliceWielowymairowe {
    public static void main(String[] args) {

        int[][] table = new int [10][10]; // [][] dwie kolumny, po 5 elementów;
        table[0][1] = 123;              // [X][Y]
        table[4][8] = 731;
        System.out.println(table[4][8]);

        int[][] table2 = {
                {1,2,3,14,25,87},
                {4,8,10,36,25,41}
        };         //tablica o dwóch wierszach, 3 elementach

        System.out.println("[0][0]: " + table2 [0][0]); //1 w tabeli
        System.out.println("[1][2]: " + table2 [1][2]); //10
        System.out.println("[0][2]: " + table2 [0][2]); //3
        System.out.println("[0][2]: " + table2 [1][5]);

        System.out.println(" table size: " + table2.length);    //sprawdzenie rozmiaru tabeli
        System.out.println(" column size 0: " + table2[0].length); //sprawdzenie rozmiaru konkretnej kolumny
    }
}
