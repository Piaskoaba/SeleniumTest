package TypyGeneryczne;



public class Main {
    public static void main(String[] args) {

        IntegerPrinter integerPrinter = new IntegerPrinter(45);
        integerPrinter.print();
        DoublePrinter doublePrinter = new DoublePrinter(23.6);
        doublePrinter.print();

    }
}