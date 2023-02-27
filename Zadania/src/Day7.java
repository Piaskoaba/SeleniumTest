import java.util.Arrays;
import java.lang.String;
public class Day7 {

    public static void main(String[] args) {

        int [] numbers = {7, 14, -8,23,-15,83,54,-67,0,202,149,859,177,-201,-654};
        int positiveSize = 0;
        int negativeSize = 0;

        for (int number : numbers) {
            if (number > 0) {
                positiveSize++;
            }else if (number < 0) {
                negativeSize++;

            }
        }
        int [] positiveNumbers = new int [positiveSize];
        int [] negativeNumbers = new int [negativeSize];
        int positiveIndex = 0;
        int negataiveIndex = 0;
            for (int number :numbers) {
                if (number> 0) {
                    positiveNumbers[positiveIndex] = number;
                    positiveIndex++;
                }else if (number <0) {
                    negativeNumbers [negataiveIndex] = number;
                    negataiveIndex++;
                }
            }
        System.out.println("Positive numbers:   " + Arrays.toString(positiveNumbers));
        System.out.println("Negative numbers:   " + Arrays.toString(negativeNumbers));
    }
}
