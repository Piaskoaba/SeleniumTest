package ENUM;

public class MainEnum {

    public static void main(String args[]) {

        KierunekSwiata kierunek = KierunekSwiata.ZACHOD;
        System.out.println(kierunek);

        if (kierunek == KierunekSwiata.POLNOC) {
            System.out.println("poszedl na polnoc: ");
        } else if (kierunek == KierunekSwiata.POLUDNIE) {
            System.out.println("poszedl na południe ");

        } else if (kierunek == KierunekSwiata.WSCHOD) {
            System.out.println("poszedl na wschod ");
        } else if (kierunek == KierunekSwiata.ZACHOD) {
            System.out.println("poszedl na zachod ");
        } else {
            System.out.println(" Cos poszlo nie tak. Wybrales zly kierunek ");

        }


        switch (kierunek) {
            case POLNOC:
                System.out.println("poszedl na polnoc: ");
            case WSCHOD:
                System.out.println("poszedl na wschod ");
                break;
            case ZACHOD:
                System.out.println("poszedl na zachod ");
                break;

            case POLUDNIE:
                System.out.println("poszedl na południe ");
                break;
            default:
                System.out.println(" Cos poszlo nie tak. Wybrales zly kierunek ");
        }

    }
}
