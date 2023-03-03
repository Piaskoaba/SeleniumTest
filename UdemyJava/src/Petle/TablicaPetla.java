package Petle;

public class TablicaPetla {
    public static void main(String args[]) {

       /* int[] tab = new int[100];
        for (int i = 0; i < tab.length; i++) {             //(int i = 0; i < 10; tab < tab.length)// rowniez poprawny. czesciej uzywany
            tab[i] = i;     //i*2, i*7 itpitd                    // przypisanie wartosci do petli, moze byc konkretna liczba

        }

        for (int i = 0; i < tab.length; i++ ){                 // uzupelnia tabele wartosciami zadeklarowanymi wyzej
            System.out.println("Tab" + i + "  :  " + tab[i]);
        }*/


int counter =0;
int [][] tab = new int[5][10];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                counter++;
                tab[i][j] = counter;
                //  System.out.println(counter);
            }
        }
            for (int i2 = 0; i2 < 5; i2++) {
                for (int j = 0; j < 10; j++) {
                    System.out.print(tab[i2][j]+" ");
                }
                System.out.println();
                }
            }
        }




