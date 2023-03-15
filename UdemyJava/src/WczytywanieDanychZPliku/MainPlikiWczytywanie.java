package WczytywanieDanychZPliku;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainPlikiWczytywanie {
    public static void main(String[] args) {


        try {
            File file = new File("plik.txt");             //sciezka do pliku
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("nie znaleziono pliku!");
        }

    }
}


