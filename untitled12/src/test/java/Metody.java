import org.junit.jupiter.api.Test;

public class Metody {

    @Test
    public void examples() {
  double poleT1 = obliczPole(1.5, 2.3, 4.6);
  double poleT2 = obliczPole(21.3, 3, 23.1);
        String tekst = " Pola trapezów to: " + poleT1+ "," + poleT2 + ",";
        System.out.print(tekst);
    }
//metoda obliczeniowa przyjmujaca argumenty
    double obliczPole (double dlugoscPodstawy, double szerokoscPodstawy, double wyskosc){

            double poleTrapezu = ((dlugoscPodstawy+szerokoscPodstawy) * wyskosc) / 2;
            return poleTrapezu;

        }
        @Test
        public void exaplle22(){
        wysokoscSkoku();
        }
        //metoda z danymi statycznymi - nie przyjmuje argumentow
        double wysokoscSkoku () {
        double silaWybicia = (1.34*2.23);
        double odleglsoc = 3.33;
        double x = silaWybicia*odleglsoc;
            System.out.print(x);
        return x;


        }


    }





