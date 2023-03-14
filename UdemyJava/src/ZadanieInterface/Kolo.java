package ZadanieInterface;

public class Kolo implements Figury {

    @Override
    public double obwod() {
        return 2 * Math.PI * r;
    }

    @Override
    public double pole() {
        return Math.PI * r * r;
    }


   private double r;

    Kolo(double r) {
        this.r = r;

    }
}
