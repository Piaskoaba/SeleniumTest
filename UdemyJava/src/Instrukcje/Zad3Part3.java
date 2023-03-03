package Instrukcje;

public class Zad3Part3 {
    public static void main(String args[]) {

        double number1 = 10;
        double number2 = 747;
        char znak = '*';
        double wynik = 0;

        switch (znak) {
            case '+':
                wynik = number1 + number2;
                break;
            case '-':
                wynik = number1 - number2;
                break;
            case '/':
                wynik = number1 / number2;
                break;
            case '*':
                wynik = number1 * number2;
                break;
            default:
                System.out.println(" Wpisz poprawnie dane: ");
        }
        System.out.println( "Wynik działania na liczbach: " + number1 + " oraz " + number2 + "to " + wynik);
    }

    }

