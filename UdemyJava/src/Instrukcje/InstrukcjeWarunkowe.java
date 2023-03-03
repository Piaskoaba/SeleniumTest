package Instrukcje;

public class InstrukcjeWarunkowe {

    public static void main(String args[]){


        int wiek = 15;
        boolean adultPerson = false;
        boolean youngAdult = true;

        if(wiek >=18){
            System.out.println("Pozwól na zakup: ");
        } else if (adultPerson) {
            System.out.println(" Popros o potwierdzenie : ");
        }else if (wiek <18 && youngAdult){
            System.out.println(" Podaj teraz: ");
        } else {
            System.out.println("Nie pozwalaj na zakup ");

        }

    }

}
