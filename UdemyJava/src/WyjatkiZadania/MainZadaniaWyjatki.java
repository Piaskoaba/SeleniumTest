package WyjatkiZadania;

public class MainZadaniaWyjatki {
    public static void main(String[] args) {

         /*Zadanie 1
W metodzie main napisz kawałek kodu, który będzie dzielił liczby a/b (typu int) i wypisywał wynik na ekran. Zobacz co się stanie,
 jeżeli pod b podasz liczbę 0. Spróbuj obsłużyć błąd try/catchem, aby w przypadku dzielenia przez zero wyskoczył
  użytkownikowi komunikat:
“Nie wolno dzielić przez 0!”*/


        try {
            int a = 10;
            int b = 0;
            System.out.println("Wynik dzielenia to " + a / b);

        }catch(ArithmeticException e){
        System.out.println("Nie wolno dzielić przez 0!");

        }
        try {
            System.out.println("Wynik z metody : " + wynikDzielenia(10,0));
        } catch (Przez0Exception e) {
            System.out.println(" Nie dzielimy przez 0 ");
        }
    }

    public static double wynikDzielenia (double a, double b) throws Przez0Exception {
        if (b==0) {
            throw new Przez0Exception();
        }
        return a/b;
    }
}
