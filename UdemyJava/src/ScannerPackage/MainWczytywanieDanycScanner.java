package ScannerPackage;

import java.util.Scanner;

public class MainWczytywanieDanycScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        //while (true) {

        //  String linia = scanner.nextLine();
        //  System.out.println("Wprowadzilem :" + linia);

        //  if(linia.equals("exit")){
        //      System.out.println("Koniec programu");
        //      break;
        //  }
        //
        String linia;

        do {
            linia = scanner.nextLine();
            System.out.println("Wprowadzilem: " + linia);

        } while (!linia.equals("exit"));
        System.out.println("Zakonczylem dzialanie");
    }


}

