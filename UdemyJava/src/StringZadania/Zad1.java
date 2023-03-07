package StringZadania;

public class Zad1 {
    public static void main (String [] args){

        String name = "Andrzej";
        String sureName = "Kowalski";
        String fullName = name + sureName;
        String randomName = "Alicja";
        String randomName2 ="Jan";



        System.out.println("Name length: " + name.length());
        System.out.println("Surename length: "+ sureName.length());
        System.out.println("Name and surename length: " + fullName.length());

        if(name.equals("Alicja")) {                                 //przy pomocy petli
            System.out.println("Masz na imię Alicja");
        }else if (name.equals("Jan")) {
            System.out.println("Masz na imię Jan ");
        }else{
            System.out.println("Ani Jan ani Alicja");

        }

        System.out.println(" Czy się zgadza: "+ name.equals(randomName) );    //po prostu equal
        System.out.println(" Czy się zgadza: "+ name.equals(randomName2) );
        System.out.println("Wszystkie wielkie litery: " + sureName.toUpperCase());
        System.out.println(" Zamaiana liter: " +sureName.replace("a","e") );




    }


}
