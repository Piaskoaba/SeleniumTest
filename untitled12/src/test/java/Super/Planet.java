package Super;

public class Planet extends  AstronomicalObject{
    private int numberOfMoons;
    private int mass;
    private float rotationPeriodInDays;
    private boolean hasRings;


    public Planet (String name){
        super(name); // super jest odniesieniem do konstruktora klasy nadrzednej, ZAWSZE na poczatku
    }
    public Planet(String name, int orbitalPeriodInDays, float radius, boolean hasRings) {
        super(name, orbitalPeriodInDays, radius);
        this.hasRings = hasRings;
    }

    public Planet(int mass){
        int i = this.mass - mass;

    }
@Override
    public int getOrbitalPeriod(){
    return super.getOrbitalPeriod()/365;
    }
}
