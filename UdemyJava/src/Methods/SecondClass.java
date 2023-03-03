package Methods;

public class SecondClass {

    void TestMethod() {
        System.out.println(" Do nothing :");
    }

    void ReturnMethod(int number, int answer, char letter) {
        String returnAnswer = "Bartosz";


        System.out.println("Value from method: " + number + " & " + answer + letter);
    }

    void nextMethod(boolean toShow, int number2) {
        if (toShow) {
            System.out.println("Wyswietlono liczbe: " + number2);
        } else {
            System.out.println("Nie wyswietlono liczby");
        }
    }

    double addictionResult(double a, double b) {
        double wynik = a + b;
        //System.out.println("Wynik wynosi: " + wynik);
        return wynik;
    }

    double substractionResult(double a, double b) {
        double wynik = a - b;
        return wynik;
    }


    boolean swapValue(boolean valueResult) {
        if (valueResult == true) {
            System.out.println("PRAWDA! :");
        } else {
            System.out.println("FAŁSZ");
        }
        return !valueResult;
    }

    int lowOrHigh(boolean sayWhat, int number) {
        sayWhat = true;
        if (number > 0) {
            System.out.println("IsItPositive: " + number);
        } else {
            System.out.println("Liczba jest ujemna : " + number);
        }
        return number;
    }
    }



