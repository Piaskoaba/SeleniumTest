package BMIv2;

import java.util.Scanner;

public class Page1 {

    public static void main(String args[]) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose your gender: ");
        System.out.println("1)  Female:  ");
        System.out.println("2)   Male:   ");

        double choose = scan.nextInt();

        System.out.println(" Enter values 1-Weight " +
                "2-Height");
        double weight = scan.nextDouble();
        double height = scan.nextDouble();

        if (choose == 1) {
            System.out.println("Values =" + (weight / (height *2 ))* 100);
        } else if (choose == 2) {

            System.out.println("Values = " + (weight / (height* 2))* 100);
        } else {
            System.out.println(" Error, Set New Values   ");
        }
    }
}







