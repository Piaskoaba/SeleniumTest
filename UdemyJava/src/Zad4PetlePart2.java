public class Zad4PetlePart2 {
    public static void main(String args[]) {
        int a = 23;
        int b = 71;

        for (int step = a; step <= b; step++) {
            System.out.print(step + " ");

        }
        System.out.println(" Zadanie 4: ");

        int[] tab = {1, 13, 18, 24, 32, 71, 77, 54, 21,-155,55};

        for (int i = 0; i < tab.length; i++) {


            System.out.println("Tabela1 " + tab[i] + " ");

        }

        for (int i = tab.length-1; i >=0; i--) {

            System.out.println("Tabela2 " + tab[i] + " ");

        }
    }
}



