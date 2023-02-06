package KlasyObiektyPola;

import org.junit.jupiter.api.Test;

public class PlanetarySystemTest {

    @Test
    public void firstTest() {
        PlanetarySystem solarSystem = new PlanetarySystem();
        solarSystem.printNumberOfPlanets();
        solarSystem.setNumberOfPlanets(7);     //set - zmienia liczbe obiektow
        solarSystem.printNumberOfPlanets();

        PlanetarySystem anotherSystem = new PlanetarySystem();  //nowy obiekt przyjmuje wartosci deafult
        anotherSystem.printNumberOfPlanets();
        anotherSystem.setNumberOfPlanets(5);
        anotherSystem.printNumberOfPlanets();

        solarSystem.printNumberOfPlanets();
    }


}





