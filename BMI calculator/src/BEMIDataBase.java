import com.sun.source.doctree.SummaryTree;
import org.junit.Test;

public class BEMIDataBase {


    public void example() {
        double equalBmi = partOfBemi(95, 188);
        String text = " Twoje BMI wynosi " + equalBmi;
        System.out.println(text);


        if (equalBmi > 25) {
            System.out.println(" Twoje BMI jest zawysokie!");

        } else if (equalBmi < 20) {
            System.out.println(" Twoje BMI jest za niskie!!! Zjedz coś ");
        }

        if (equalBmi >= 20.01 && equalBmi <= 25) {
            System.out.println(" Jest OK! Tak trzymaj. ");
        }
    }
    double partOfBemi (double weight, double height){
         double wynik = ((weight / (height*2))*100);
         return wynik;
    }
    }









