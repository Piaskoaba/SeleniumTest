package WyjatkiTworzenie;

public class MainWyjatki {


    public static void main(String[] args) {

        User user = new User();

        try {
            user.wprowadzEmail("jan.kowalski/example.com");
            System.out.println("Adres mailowy wprowadzony poprawnie" );
            user.setPassword("qwerty123tajne");    // clt + enter surround by try catch
            System.out.println("Haslo ustawione" );
        } catch (HasloException e) {
            System.out.println(" Hasło nie jest bezpieczne...");
        }catch ( NirpoprawnyEmailException e){
            System.out.println("email niepoprawny");
        }
        System.out.println("Sprawdzenie");
    }
}
