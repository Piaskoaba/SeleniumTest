package Finally;

public class MainFinally {
    static String str = " TEKST ";

    public static void main(String args[]) {



        try {
            System.out.println("WSZYSTKO WIELKA LITERA" + str.toUpperCase());
            str.charAt(100);
        } catch (NullPointerException | StringIndexOutOfBoundsException e) {
            System.out.println("NULL");
        } finally {
            System.out.println(" Will DO IT ANYWAY");           // wykona sie pomimo wykrytych wczesniej bledow
        }                                                       //uzywany np.operacje zamkniecia pliku, przy wykonanej lub niewykonanej operacji

    }
}

