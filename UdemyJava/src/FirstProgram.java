public class FirstProgram {



    public static void main(String args[]) {

        int numberOfThings;
        numberOfThings = 139;

        int numberOfDoors;
        numberOfDoors = 3;

        int XY = numberOfDoors + numberOfThings;
        System.out.println(XY);


        int zmiennaInt = 10;
        double zmiennaDouble = 99;

        int zmienna = (int) zmiennaDouble;   // konwertowanie jawne (rzutowanie), z wiekszego na mniejsze;

        int firstNumber = 7;
        double secondNumber = 49.3;
        int wynik = (int) (secondNumber / (double) firstNumber);
        System.out.println(wynik);

        char A = 'Y';
        int result = A;
        System.out.println(result);   //mozna konwertowac string na int. ASCII codes, tabela znakow

    }
}
