public class Kwadrat1 extends Trojkat {


    public double poleKwadratu(double bokKwadratu) {

        double polekwadratu = Math.pow(bokKwadratu, 2);
        System.out.println(polekwadratu);
        return polekwadratu;

    }

    public double obwodKwadratu (double bokKwadratu){

        double obliczObwod = 4*bokKwadratu;
        System.out.println(obliczObwod);
        return obliczObwod;


    }


    public double poleKwadratu2 (double bokKwadratu) {

        if (bokKwadratu<=0){
            System.out.println("Nie moze byc ujemne");
            return 0;

        }else{
            double polekwadratu = Math.pow(bokKwadratu, 2);
            System.out.println(polekwadratu);
            return polekwadratu;

        }

    }

    public void sprawdzOblicz(double bokKwadratu) {

        if (bokKwadratu < 0) {
            System.out.println(" nie moze byc <0");

        }
        if (bokKwadratu == 0) {
            System.out.println(" nie moze byc = 0");

        } if (bokKwadratu>0) {
            System.out.println("bokKwadratu jest wiekszy  od 0 " );
            obwodKwadratu (bokKwadratu);

        }

    }

}