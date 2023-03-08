package ModyfikatoryZad;

public class ProgramistaZad1 {

    private String imie;
    private String nazwisko;
    private String jezyk;
    private double zarobki;

    public ProgramistaZad1(String simie, String snazwisko, String sjezyk, double szarobki){

        imie = simie;
        nazwisko =snazwisko;
        jezyk = sjezyk;
        zarobki = szarobki;
    }

    public static ProgramistaZad1 createProgramistaZad1(String simie, String snazwisko, String sjezyk, double szarobki) {
        return new ProgramistaZad1(simie, snazwisko, sjezyk, szarobki);
    }


    public String pobierzImie() {
        return imie;
    }

    public String pobierzNazwisko() {
        return nazwisko;
    }

    public String pobierzJezyk() {
        return jezyk;
    }

    public double pobierzZarobki(){
        return zarobki;
        }





    }





