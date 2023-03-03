public class Zad4Part3 {
    public static void main(String args[]) {

        System.out.println(" Zadanie 5: ");
        int wynik = 0;

        int[] tab = {1, 13, 18, 24, 32, 71, 77, 54, 21, 1, 55};

        for (int i = 0; i < tab.length; i++) {
            wynik = tab[i] + wynik;
        }

        // System.out.println("Wynik " + wynik);

        System.out.print("Zadanie6 ");

        int silnia = 5;
        int wynikSilnia = 1;

        for (int i = silnia; i >= 1; i--) {
            wynikSilnia = wynikSilnia * i;
        }

        //System.out.println("wynik silnia: " + wynikSilnia);


        System.out.println(" Zadanie 7 ");

        int star = 7;
        int addStar = 1;

        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= addStar; j++) {
                System.out.print("*");
            }
            System.out.println();
            addStar++;

        }
        for (int i = 1; i <= star; i++) {
            for (int j = 1; j <= addStar; j++) {
                System.out.print("     *");
            }
            System.out.println();
            addStar++;
        }
    }
}



