import java.lang.String;
public class Dane {


    public String historyjka (String imie, String nazwisko, String wiek, String miasto){

        String text = "czlowiek o imieniu " + imie + " nazwisku " + nazwisko + " oraz wieku " + wiek + " z miasta " + miasto;
        return text;
    }
    public String historyjka (String imie, String nazwisko, int wiek, String miasto){

        String text = "czlowiek o imieniu " + imie + " nazwisku " + nazwisko + " oraz wieku " + wiek + " z miasta " + miasto;
        return text;
    }
    public String historyjka (String imie, String nazwisko, int wiek, String miasto, double wzrost) {

        String text = "czlowiek o imieniu " + imie + " nazwisku " + nazwisko + " oraz wieku " + wiek + " z miasta " + miasto + " wzrost " + wzrost;
        return text;
    }
}
