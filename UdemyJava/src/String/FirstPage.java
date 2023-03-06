package String;

public class FirstPage {
    public static void main (String [] args){
        String tekst = "Przykladowy tekst";
        System.out.println("Liczba String:" + tekst.length());
        tekst.isEmpty();
        System.out.println("Is empty :" + tekst.isEmpty());
        char pojedynczyZnak = tekst.charAt(3);
        System.out.println(pojedynczyZnak);

        String substring = tekst.substring(11);
        System.out.println("Begin: " + substring);
        System.out.println("Substring : " + tekst.substring(0,11));  //sybstring - printowanie wycinka tekstu, od indeksu zero
        String nowyString = "qweasdzxc    ewqdsacxz     ";
        System.out.println(". " + nowyString + " .");
        System.out.println("trim:" + "." + nowyString.trim() + "."); // trim().   usuwa znaki biale(spacje, kropki) z porzatku i konca

        String rozneWielkosciLiter = "Różne liery, DUZE i MALE";
        System.out.println(" to lower case:" + rozneWielkosciLiter.toLowerCase()); //. toLowerCase - wszytkie literty male
        System.out.println("TO UPPER CASE: " + rozneWielkosciLiter.toUpperCase()); // toUpperCase - wszystkie litery duze

        String czyZawiera = "czy zawiera jakis tekst";
        System.out.println(czyZawiera.startsWith("czy zawiera"));  //startsWith sprawdzenie czy zaczyna sie od konkretnego stringa

        String uproszczony = czyZawiera.toLowerCase().trim();       //mozna utworzyc nowy string i dolaczyc metode
        System.out.println("Uproszczony: " + uproszczony.startsWith("czy"));
        System.out.println(" Simple versions:" + czyZawiera.toLowerCase().trim().startsWith("czy"));  //druga opcja uproszczenia

    String czyZawieraKoncowke = " tekst z koncowka";

        System.out.println("ends with: " + czyZawieraKoncowke.endsWith("koncowka")) ; // j/w tylko z koncowkami


        System.out.println("contains: " + czyZawiera.contains("jakis"));   //.contains sprawdza czy w ogole znajdue sie


        System.out.println("replace:" + czyZawiera.replace('a','b'));       //.replace podmienia pojedyncze znaki 'old'/'new'









    }
}
