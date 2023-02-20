import java.util.Scanner;

public class Menu {

    boolean exit;

    public void runMenu() {
        firstPage();
        secondPage();
        while (!exit) {
            firstPage();
            secondPage();
            int choice = getInput();
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
        System.out.println(" Choose Your gender");
        System.out.println("Are You Female ?");
        System.out.println("Are You Male ?");
        System.out.println("Go back to Menu");
    }

    private int getInput() {
        Scanner bm = new Scanner(System.in);
        int choice = -2;
        while (choice < 0 || choice > 2) {
            try {
                System.out.print(" Enter Your gender: ");
                choice = Integer.parseInt(bm.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(" Invalid choice. Try again ");
            }
        }
        return choice;
    }
}
