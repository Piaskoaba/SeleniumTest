import java.lang.String;

public class Trojkat {

   public double poleTrojkata (double dlugoscPodstawy, double wysokosc){
       double obliczPoleTrojkata = (dlugoscPodstawy * wysokosc)/2;
       System.out.println(obliczPoleTrojkata);
       return obliczPoleTrojkata;
   }

    public double poleTrojkata (String dlugoscPodstawy, String wysokosc){
        double dlugoscPodstawy2 = Double.parseDouble(dlugoscPodstawy);
        double wysokosc2 = Double.parseDouble(wysokosc);
        double obliczPoleTrojkata = (dlugoscPodstawy2 * wysokosc2)/2;
        System.out.println(obliczPoleTrojkata);
        return obliczPoleTrojkata;
    }

    public String poleTrojkataString (String dlugoscPodstawy, String wysokosc){
        double dlugoscPodstawy2 = Double.parseDouble(dlugoscPodstawy);
        double wysokosc2 = Double.parseDouble(wysokosc);
        double obliczPoleTrojkata = (dlugoscPodstawy2 * wysokosc2)/2;
        String obliczPoleTrojkata2 = String.valueOf(obliczPoleTrojkata);
        System.out.println(obliczPoleTrojkata);
        return obliczPoleTrojkata2;
    }
}

