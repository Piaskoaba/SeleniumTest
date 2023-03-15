package ZapisywanieDoPliku;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PlikZapisywanie {
    public static void main(String[] args) {
        try {
            String path = "moj_plik.txt";
            FileWriter fileWriter = new FileWriter(path, true);   //,true - mozna dodawac bezposrednio w pliku
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Jakis ciag znako\n");         //zapisanie w kolejnej linijce
            bufferedWriter.newLine();           //zapisywanie w kolejnej linijce
            bufferedWriter.write("KOlejny text");
            bufferedWriter.newLine();
            bufferedWriter.write("Jeszcze jeden kolejny text");
            bufferedWriter.newLine();

            bufferedWriter.close(); //trzeba zamknac bufferwriter na koncu

        } catch (IOException e) {
            System.out.println("Błąd na operacjach");
        }

    }
}