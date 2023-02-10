package Enum;

public class CoffeMaker {

    public void prepare (CoffeType coffeType) {

        //1: latte
        //2: mocha
        //3: cappucino
        //4: machiato
        //5: flat white
        //6: espresso
        //7, 8 bezkofeinowa


        String message = switch (coffeType) {

            case LATTE -> "Przygotowuję latte...";
            case MOCHA -> "Przygotowuję mocha...";
            case CAPPUCINO -> "Przygotowuję cappucino...";
            case MACCHIATO -> "Przygotowuję macchiato...";
            case FLATEWHITE -> "Przygotowuję flatwhite...";
            case EPSRESSO -> "Przygotowuję espresso...";
            case CAFFEINFREE -> "Przygotowuję bezkofeinową...";
        };
        System.out.println(message);

        }


    }


