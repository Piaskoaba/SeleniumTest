package ENUM;

public enum Pizza {


    MALA(20,19.99f),
    DUZA(34,29.99f),
    FAMILIJNA(42,39.99f),
    XXL(50,59.99f);

    private int rozmiar;
    private float cena;


    private Pizza(int rozmiar, float cena) {            //konstruktory w ENUM sa prywatne
        this.rozmiar = rozmiar;
        this.cena = cena;

    }
    public int pobierzRozmiar(){
        return this.rozmiar;
    }

    public float pobierzCene(){
        return this.cena;
    }


}
