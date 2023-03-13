package WyjatkiTworzenieSuper;

public class MainWyjatkiTworzenieSuper {
    public static void main(String[] args) {

        try {
            wyrzucJakisWyjatek();
        } catch (JakisException e) {
            System.out.println("Obsługuję wyjatek podczas catch " + e.getMessage());

        }

    }

    public static void wyrzucJakisWyjatek() throws JakisException {
        throw new JakisException("Specjalna wiadomość");
    }

}