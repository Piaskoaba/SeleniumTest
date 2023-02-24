import org.junit.Test;

public class Day3 {
    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        int c = 3;


        String text = "Największa liczbza to: ";

        if (a > b && a > c) {
            System.out.println(text + a);
        } else if (b > a && b > c) {
            System.out.println(text + b);
        } else if (c > a && c > b) {
            System.out.println(text + c);
        } else {

            System.out.println("Wprowadzona liczba nie spełnia warunku");
        }
    }
}

