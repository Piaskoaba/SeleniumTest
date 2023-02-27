

import java.util.Scanner;

public class Day5 {


    public void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new word:  ");
        java.lang.String word = scanner.next();
        System.out.println(" Repeat: ");
        int repeat = scanner.nextInt();
        System.out.println(" Answer: ");
           for (int i = 0; i <repeat; i++) {
               System.out.println(word);
           }


    }
}
