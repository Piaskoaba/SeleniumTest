package Calc;

public class Maths extends MathException{
    double a;
    double b;

    public double dodawanie(double a, double b) {
        return a + b;

    }

    public double odejmowanie(double a, double b) {
        return a - b;
    }

    public double mnozenie(double a, double b) {
        return a * b;
    }

    public void dzielenie() {

        try {
            double a = 10;
            double b = 0;
            System.out.println("Wynik dzielenia to " + a / b);

        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez 0!");

        }

    }


    public double wynikDzielenia(double a, double b) throws MathException {
        if (b == 0) {
            throw new MathException();
        }
        System.out.println("wynik to: "
                + a / b);
        return a / b;
    }
}

