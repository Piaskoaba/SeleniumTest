package ScannerPackage;

import java.util.Scanner;

public class Scanner1 {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);


   /* while (scanner.hasNextInt()){
        int wczytany = scanner.nextInt();
        System.out.println("wartosc " + wczytany);
    }
    System.out.println("zadanie zakoncznone");

    */

    while(true){
        String next = scanner.next();           //.next widzi do momentu spacji po czym wyswietla w nowej linii
        System.out.println("Wypisany text: " + next);
        if (next.equals("exit")){
            System.out.println ("Zakonczylem dzialanie");
            break;

        }
    }
}

}
