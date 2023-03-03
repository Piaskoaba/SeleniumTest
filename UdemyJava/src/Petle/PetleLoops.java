package Petle;

public class PetleLoops {

    public static void main(String args[]) {

       /*\ int count;
        for (count=1; count <=10; count++){   //inkrementacja +1
            System.out.println(" Tekst " + count);
        }
        System.out.println(" Out of:  " + count);
        */

       /* int counter = 1;

        while(counter <= 10) {
            System.out.println("Tekst " + counter);
            counter++;
        }

         counter = 1;

        do {                                //wykona sie przynajmniej raz. Najpierw wykona, potem sprawdzi
            System.out.println(" Do While wartosc: " + counter);
            counter++;
        } while( counter<= 10);
*/


        int thing;
        for (thing = 1; thing <= 20; thing++) {
            System.out.println("Before continoue: " + thing);
            if (thing == 18) {
                continue;                       // pomija napotkany warunek i sprawdza dalej
            }
            System.out.println("Result " + thing);
        }
        for (thing = 1; thing <= 20; thing++) {
            if (thing == 10)
                break;                      // po napotkaniu warunku zatrzymuje program
            System.out.println(" second loop" + thing);
        }
        for (thing = 1; ; thing++) {          // niezbedne ;;
            if (thing == 100)                   //wykona sie do momentu wartosci np.100
                break;                      //
            System.out.println(" Third loop" + thing);
        }


    }
}

