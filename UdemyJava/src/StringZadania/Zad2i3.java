package StringZadania;

public class Zad2i3 {
    public static void main(String[] args) {

        // napisz zdanie "Potrafię coraz więcej z programowania"", wypisz kazda litere w osobnym wierszu
        //wypisz w/w zdanie od tyłu


       /* String zdanie = "Potrafię coraz więcej z programowania";

        for (int i = 0; i < zdanie.length(); i++){
            System.out.println( zdanie.charAt(i));
        }
*/

        String zdanie = "Potrafię coraz więcej z programowania";

        for (int i =zdanie.length()-1; i >=0; i--) {
            //System.out.println(zdanie.charAt(i));
            System.out.print(zdanie.charAt(i));
        }
    }
}