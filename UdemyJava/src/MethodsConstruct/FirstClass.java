package MethodsConstruct;

public class FirstClass {
    public static void main(String args[]){

        SecondClass secondClass = new SecondClass();

        secondClass.TestMethod();

        secondClass.firstMethod(1,3,'B');
        System.out.println("Tekst to: " );

        secondClass.nextMethod(false,1);

        secondClass.addictionResult(4,5.6);

        double wynikDodawania = secondClass.addictionResult(1,7);
        System.out.println("Wynik dodawania : " + wynikDodawania);

        double wynikOdejmowania = secondClass.substractionResult(10.73,99);
        System.out.println("Wynik odejmowania : " + wynikOdejmowania);

        System.out.println(" Logical value : " + secondClass.swapValue(false));

        secondClass.lowOrHigh(false,-5);

        Konstruktory konstruktory = new Konstruktory(321); //w klasie Konstruktory sa 3 konstruktory, pusty, z 1 watoiscia, z dwiema. Dlatego mozna uzupelniac taka iloscia danych 0/1/2
        System.out.println(konstruktory.pole1);
        System.out.println(konstruktory.pole2);
        System.out.println(konstruktory.pole3);
        System.out.println(konstruktory.pole1 + konstruktory.pole2 + konstruktory.pole3);


        Construct construct = new Construct();  // konstruktor pusty/domyslny

    }
}
