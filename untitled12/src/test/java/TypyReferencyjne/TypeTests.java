package TypyReferencyjne;

import KlasyObiektyPola.PlanetarySystem;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TypeTests {

    @Test

    public void doesIntChangeValueTest() {
        int firstInt = 5;
        int secondInt = firstInt;
        firstInt = 6;

        Assertions.assertEquals(5, secondInt); //assertions - klasa Junit5, framework do testow jednostkowych, tj porownuje wartosc
        // pierwszy argument "5 oczekujemy 5" secondInt sprawdzamy firstInt

    }

    @Test

    public void doesObjectChangeValueTest(){        // w typach referencyjnych poslugujemy sie referencja, a NIE wartoscia

        PlanetarySystem firstSystem = new PlanetarySystem();
        PlanetarySystem secondSystem = firstSystem; //zmienna, ktora ma przechowac referencje do tego samego obiektu co 1st system
        firstSystem.setNumberOfPlanets(13);
        Assertions.assertEquals(13,secondSystem.getNumberOfPlanets());


}

@Test
    public void doesItChangeValueTest(){
        String firstString = "pierwszy";
        String secondString = firstString;
        firstString = "zmieniony";
    Assertions.assertEquals("zmieniony", secondString);  //typ String jest niezmienny
}

         }


