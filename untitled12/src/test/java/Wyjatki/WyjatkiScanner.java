package Wyjatki;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WyjatkiScanner {

    public static void main(String[] args) {
        int password = 1111;

        Scanner scanner = new Scanner(System.in);  //klasa scanner,w argumencie zrodlo odczytywania danych np.System.in)

        System.out.println("Password");

        int providedPassword = 0;


        try{                //obsluguje wyjatki
            providedPassword = scanner.nextInt();      //nextInt sczytuje INT
        } catch (InputMismatchException e){                 //catch wyłapuje wyjatki
    e.printStackTrace();
        } finally {                                     // zawiera instrukcje po wylapaniu wyjatku, "sprzata po bledzie", jezeli wylapie blad, nie wykonuje dalszych dzialan
            System.out.println("Cleanup ");
            scanner.close();
        }


        if (password == providedPassword) {
            System.out.println("You`ve beed logged in. ");
        } else {
            System.out.println("Incorrect password ");
        }
        System.out.println("End of the program ");

    }
}


