package MethodsConstruct;

public class Konstruktory {


    int pole1;
    int pole2;
    int pole3;




Konstruktory () {           //pusty
    System.out.println(" Konstruktor bez wartosci, pusty" );
    }

Konstruktory (int value1) {         // z jedna wartoscia
    System.out.println(" Konstruktor z jedna wartoscia/ druga stała: " );
    pole1 = value1;
    pole2 = 1000;

}

Konstruktory(int valuePole1, int valuePole2) {
    System.out.println(" Konstruktor z dwoma wartosciami: ");
    pole1 = valuePole1;
    pole2 = valuePole2;

}
    Konstruktory (int val1, int val2, int val3) {
        pole1 = val1;
        pole2 = val2;
        pole3 = val3;

    }
}





