public class Zad3part2 {
    public static void main(String args[]) {


        double kwota = 55321.89;

        if (kwota <0) {
            System.out.println(" Błędnie podane dane: ");
        }
        else if (kwota < 85528) {
            double podatek = kwota * 0.17;
            System.out.println("Podatek wynosi: " + podatek);
        } else {
            double podatekPonizejProgu = 85528 * 0.17;
            double podatekPowyzejProgu = (kwota - 85528) * 0.32;
            double podatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Podatek wynosi : " + podatek);
        }
    }




}
