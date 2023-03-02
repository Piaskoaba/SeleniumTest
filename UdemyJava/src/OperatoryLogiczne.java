public class OperatoryLogiczne {
    public static void main(String args[]){

        int wiek  = 15;

        //koniunkcja (AND) &&


        System.out.println(wiek >= 18 && wiek <30);  //dla wieku 20, warunek spełniony
        System.out.println(wiek >= 40 && wiek <80);  //niespelniony;

        //alternatywa (OR) ||
        System.out.println(wiek <18 || wiek >30); // wystarczy, że jest spełniony przynajmniej jeden warunek

        //negacja

        boolean prawda = true;                          //deklarujemy boolean
        System.out.println("!prawda: " + prawda);

    }
}
