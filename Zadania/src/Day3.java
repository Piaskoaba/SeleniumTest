import java.lang.String;

public class Day3 {
    public static void main(String[] args) {

        int a = 3;
        int b = 101;
        int c = 100;

String text = "Największa liczba to: ";

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

