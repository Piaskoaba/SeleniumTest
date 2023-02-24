public class Day2 {


    public static void main(String[] args) {

        int number = -1;
        java.lang.String numberWord = " ";

        if (number < 0 && number < 10) {
            switch (number) {
                case 0:
                    numberWord = "zero";
                    break;
                case 1:
                    numberWord = "jeden";
                    break;
                case 2:
                    numberWord = "dwa";
                    break;
                case 3:
                    numberWord = "trzy";
                    break;
                case 4:
                    numberWord = "cztery";
                    break;
                case 5:
                    numberWord = "pięć";
                    break;
                case 6:
                    numberWord = "sześć";
                    break;
                case 7:
                    numberWord = "siedem";
                    break;
                case 8:
                    numberWord = "osiem";
                    break;
                case 9:
                    numberWord = "dziewięć";
                    break;
            }
            System.out.println("Twoja liczba to: " + numberWord);
        } else {
            System.out.println("Wrong number");

        }
    }
}

