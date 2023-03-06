package Pola;

public class KlasaObiektyPola {

    public static void main (String [] args){

    int typProsty = 100;
    Exapmle przyklad = new Exapmle();
    Exapmle przykladDrugi = new Exapmle();
przyklad.pole =123;
przykladDrugi.pole =321;
        System.out.println("Przyklad: " + przyklad.pole);
        System.out.println("Przyklad: " + przykladDrugi.pole);
        System.out.println("Typ prosty: " +typProsty);
}

}
