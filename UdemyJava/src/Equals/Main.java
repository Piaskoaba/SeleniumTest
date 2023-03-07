package Equals;

public class Main {

    public static void main(String args[]){

        String strLiteral1 = "tekst";
        String strLiteral2 = "tekst";
        String strLiteral3= "cos nowegeo";
        boolean wynik = strLiteral1 == strLiteral2;
        System.out.println("strLiteral1 +strLiteral2" + wynik);         //== odnosi sie do miejsca w pamiecie, nie porownuje String


        String strObject1 = new String("tekst");
        String strObject2 = new String("tekst");
        wynik = strObject1 == strObject2;
        System.out.println("strObject1 + strObject2 :" + wynik);          // j/w dwa obiekty dwa rozne miejsca w pamieci

        wynik = strLiteral1 == strObject1;
        System.out.println("strLiteral1 + strObject1 :" + wynik);

        wynik = strLiteral1.equals(strLiteral2);                    //.equals sprawdzanie tekstu,String. Niezaleznie od miejsca w pamieci
        System.out.println("stlit1 + st lit2:" + wynik);

        wynik = strLiteral1.equals(strObject2);
        System.out.println("lit1 + obj2 :"+ wynik);

        wynik = strLiteral1.equals(strLiteral3);
        System.out.println("1 + 3 string: " +wynik);










    }

}
