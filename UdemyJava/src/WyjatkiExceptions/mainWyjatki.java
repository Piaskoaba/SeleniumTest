package WyjatkiExceptions;

public class mainWyjatki {
    static String str;
    static int[] tablica;

    public static void main(String[] args) {


       /* try {
            System.out.println("Przed wykonaniem");     // przed bledem, wykonane
            System.out.println("czy pusty " + str.isEmpty());   // nie wykona sie nic ZA wylapanym bledem
            System.out.println("po wykonaniu");

        } catch (NullPointerException e) {          //e,ex,exception
            System.out.println("String nieutworzony");

        }*/
        tablica = new int[2];
        try {
            tablica[0] = 101;
            tablica[1] = 102;
            tablica[2] = 103;
            System.out.println("Operacja wykoanana");

        } catch (NullPointerException e) {
            System.out.println("Nie utworzyles tablicy");
        } catch
        (ArrayIndexOutOfBoundsException e) {                // wyjatki mozna zapisywac w jednym catch Null... | Array... e/ex/exeption
            System.out.println("Wartosc jest poza tablica");
        }


        System.out.println("Wypisz na koniec programu ");


    }
}
