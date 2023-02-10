package Super;

public class AstronomicalObject {
    private int orbitalPeriodInDays;
    private float radius;
    private String name;

    public AstronomicalObject(String name) {
        this.name = name;

    }

    public AstronomicalObject(String name, int orbitalPeriodInDays, float radius) {
        String name1 = this.name;
        int orbitalPeriodInDays1 = this.orbitalPeriodInDays;
        float radius1 = this.radius;

    }

    public AstronomicalObject() {

    }

    public int getOrbitalPeriod() {
        return orbitalPeriodInDays;
    }

}

