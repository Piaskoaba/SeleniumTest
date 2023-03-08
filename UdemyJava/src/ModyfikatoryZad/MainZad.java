package ModyfikatoryZad;

public class MainZad {

    public static void main(String[] args) {



        ProgramistaZad1 programistaZad1 = new ProgramistaZad1("Jan", "Kowalski", "Java", 3200);
        System.out.println("Imię " + programistaZad1.pobierzImie());
        System.out.println("Nazwisko " + programistaZad1.pobierzNazwisko());
        System.out.println("Język " + programistaZad1.pobierzJezyk());
        System.out.println("Zarobki " + programistaZad1.pobierzZarobki());


        System.out.println( " ZADANIE 2");

        int[] tablica = {-5, 45, 199, 237, 127, 547, 692, 6};

        Zadanie2 zadanie2 = new Zadanie2(tablica);
        System.out.println(" Wartość max: " + zadanie2.max());
        System.out.println("Wartość min: " + zadanie2.min());
        System.out.println(" Wartosc srednia :" + zadanie2.srednia());
        System.out.println("Warosc sumy: " + zadanie2.suma());


        System.out.println( " ZADANIE 3" );

        Zadanie3 zadanie3 = new Zadanie3();
        System.out.println(Zadanie3.obwodKola(4));


    }
}















