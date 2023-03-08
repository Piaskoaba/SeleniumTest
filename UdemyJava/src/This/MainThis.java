package This;

public class MainThis {
    public static void main(String[] args) {

        KlasaRozszerzy obiekt1 = new KlasaRozszerzy();
        System.out.println("ODDZIELENIE");
        KlasaRozszerzy obiekt2 = new KlasaRozszerzy(111);
        System.out.println("ODDZIELENIE");
        KlasaRozszerzy obiekt3 = new KlasaRozszerzy(1,22);
        System.out.println(obiekt3.x);
        System.out.println(obiekt3.y);
        obiekt3.metodaZparametrami(125542);
        System.out.println("Pole" + obiekt3.pole);


    }
}