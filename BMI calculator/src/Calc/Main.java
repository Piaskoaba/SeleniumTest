package Calc;

public class Main {

        public static void main(String[]args){


            Maths maths = new Maths();
            try {
                System.out.println(maths.wynikDzielenia(10,0 )+ "wynik dzielenia to");
            } catch (MathException e) {
                System.out.println("Nie dziel przez zero!");
            }





        }
}
