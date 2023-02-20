import java.util.Scanner;

public class Menu {

    boolean exit = false;

    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.runMenu();
        menu.firstPage();
        menu.secondPage();
    }

    private void runMenu() {

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


   
}




