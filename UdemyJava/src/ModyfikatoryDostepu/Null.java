package ModyfikatoryDostepu;

public class Null {

    static String str;
    public static void main(String[] args) {

        if (str == null) {
            System.out.println("Str jest nullem: ");
        }

        str.isEmpty(); //String str bez wartosci, blad null exceptions


    }
}
