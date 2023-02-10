package TypyGeneryczne;

public class Printer <T> {          //klasa parametryzowana przez typy <T>

    T number;

    public Printer(T number){
        this.number = number;
    }

    public void print() {
        System.out.println(number);
    }
}
