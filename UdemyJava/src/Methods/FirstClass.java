package Methods;

public class FirstClass {
    public static void main(String args[]){

        SecondClass secondClass = new SecondClass();

        secondClass.TestMethod();

        secondClass.ReturnMethod(5,4,'B');

        secondClass.nextMethod(false,1);

        secondClass.addictionResult(4,5.6);

        double wynikDodawania = secondClass.addictionResult(1,7);
        System.out.println("Wynik dodawania : " + wynikDodawania);

        double wynikOdejmowania = secondClass.substractionResult(10.73,99);
        System.out.println("Wynik odejmowania : " + wynikOdejmowania);

        System.out.println(" Logical value : " + secondClass.swapValue(false));

        secondClass.lowOrHigh(true,-5);

    }
}
