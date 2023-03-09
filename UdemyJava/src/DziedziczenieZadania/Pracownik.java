package DziedziczenieZadania;

public class Pracownik extends Osoba {


    String stanowisko;
    String nazwaFirmy;


    Pracownik(String imie, String nazwisko, String nazwaFirmy, String stanowisko) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;

    }

    @Override
    void przedstawSie() {
        super.przedstawSie();
        System.out.println(" pracuje w   " + nazwaFirmy + " na stanowisku  " + stanowisko);

    }
}