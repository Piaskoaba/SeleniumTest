package WyjatkiTworzenie;

public class User {

    public void setPassword(String haslo) throws HasloException {   // jezeli jest wiecej wyjatkow zapisujemy po przecinku

        if (!haslo.contains("tajne")) {               //contains - zawiera
            throw new HasloException();         //tworzymy obiekt i przerzucamy za metode z throws (s) na koncu
        }
    }


    public void wprowadzEmail(String email) {
        if (!email.contains("@")) {       //! negacja przed
            throw new NirpoprawnyEmailException();
        }
    }
}