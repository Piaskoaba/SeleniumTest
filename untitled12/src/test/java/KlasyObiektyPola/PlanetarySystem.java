package KlasyObiektyPola;

public class PlanetarySystem {
    private String starName = " sun";
    private String starTpe = " yellow dwarf";
    private int NumberOfPlanets = 8;

   public String getStarName() {            //jezeli jest private, ustawiamy nowa metode na public
        return starName;            // return = opisujemy co chcemy zwrocic
    }

    public void setNumberOfPlanets (int number) {
    NumberOfPlanets = number;

    }
    public int getNumberOfPlanets() {
        return NumberOfPlanets;
    }
    public void printNumberOfPlanets(){


        System.out.println(" Number of planets: " + NumberOfPlanets);
    }

}


