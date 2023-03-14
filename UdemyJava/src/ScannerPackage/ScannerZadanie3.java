package ScannerPackage;

import java.util.Scanner;

public class ScannerZadanie3 {
    /*Zadanie 3
Wczytaj całą linię tekstu z klawiatury. Następnie pobierz liczbę. Wypisz na ekran wczytaną linię tyle razy ile wynosi podana liczba*/
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz zdanie: ");
        String line = scanner.nextLine();
        System.out.println("wprowadz liczbe: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++){
            System.out.println(line);
        }
    }
}
