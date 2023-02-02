import org.junit.jupiter.api.Test;

public class Planety {
    @Test
            public void exaple(){

        String [] planety = new String [8]; // pierwszy [] - tablica []drugi ilosc elementów

        planety [0] ="Merkury";
        planety [1] = "Wenus";
        planety [2] = "Ziemia";
        String planetaPierwsza = planety[0];


    }

    @Test
        public void exapmple2(){

String[] planety = {"Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun", "Pluton"};

String czwartaPlaneta = planety[3];
String osmaPlaneta= planety[8];



    }

    @Test
    public void exapmple3(){

        int[][] srednicaPlanet = new int [8][2]; // [wiersze][kolumny]

        srednicaPlanet[0][0] = 1;
        srednicaPlanet[0][1] = 1234;
        srednicaPlanet[1][0] = 2;
        srednicaPlanet[1][1] = 2345;
        srednicaPlanet[2][0] = 3;
        srednicaPlanet[2][1]= 3214;


    }

    @Test
    public void example4(){
        int[][] sredniaPlanet = {{1,1234},{2,2345},{3,3214}}; //[][] deklarowanekol/wier

    }



}