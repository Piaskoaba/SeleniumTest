package TypyGeneryczne;



public class Main {
    public static void main(String[] args) {

        IntegerPrinter integerPrinter = new IntegerPrinter(45);
        integerPrinter.print();
        DoublePrinter doublePrinter = new DoublePrinter(23.6);
        doublePrinter.print();
        FloatPrinter floatPrinter = new FloatPrinter(37.654f);
        floatPrinter.print();

        Printer<Integer> printer = new Printer<>(67);
        printer.print();



    }
}