import java.util.InputMismatchException;
import java.util.Scanner;

public class Effect extends BEMIDataBase{

public static void main(String[]args){

    int password = 1;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Choose gender: 1 Female || 2 Male ");

    int providePassword = 1;

    try {
        providePassword = scanner.nextInt();
    } catch (InputMismatchException e){
        e.printStackTrace();
    } finally {
        System.out.println("Jestes kobieta, wprowadz dane ");
        scanner.close();
    }
    if (password == providePassword){
        System.out.println(" Zalogowano" );
    }else{
        System.out.println(" Wprowadzono niepoprawną wartość ");
    }




}

}
