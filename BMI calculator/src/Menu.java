import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    boolean exit;

    public void runMenu() {
        firstPage();
        secondPage();
        while (!exit) {
            firstPage();
            secondPage();
            double base = example();
        }
    }


    public void firstPage() {
        System.out.println("------------");
        System.out.println("|            |");
        System.out.println("| Welcome in |");
        System.out.println("|     BMI    |");
        System.out.println("| Calculator |");
        System.out.println("|            |");
        System.out.println("------------");
    }


    public void secondPage() {
        System.out.println(" Set your weight: ");
        // .out.println(" Choose Your gender");
        // System.out.println("Are You Female ?");
        // System.out.println("Are You Male ?");
        // System.out.println("Go back to Menu");
    }

    private int getInput() {
        Scanner bm = new Scanner(System.in);
        int choice = -2;
        while (choice < 0 || choice > 2) {
            try {
                System.out.print(" Set: ");
                choice = Integer.parseInt(bm.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Invalid choice. Try again ");
            }
        }
        return choice;
    }

    public double example() {
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
      return 0;
    }

    double partOfBemi (double weight, double height){
        double wynik = ((weight / (height*2))*100);
        return wynik;
    }


}





