package KlasyAbstrakcyjne;

public class MainKlasaAbstrakcyjna {
    public static void main(String args[]){

        KlasaZwykla klasaZwykla = new KlasaZwykla();
        klasaZwykla.metodaAbstrakcyjna();
        klasaZwykla.metodaZParametrem("hej");
        klasaZwykla.metoda();


        Pies pies =new Pies();
        Kot kot = new Kot();
        Kon kon = new Kon();

        System.out.println();


        System.out.println(" DLA PSA");

       pies.dzwiek();
       pies.przemieszczanie();
       pies.karmieniePotomstrwa();
       pies.dzwiek();
       pies.temperaturaCiala();
        System.out.println();




        System.out.println(" DLA KOTA");

        kot.dzwiek();
        kot.przemieszczanie();
        kot.karmieniePotomstrwa();
        kot.dzwiek();
        kot.temperaturaCiala();
        System.out.println();



        System.out.println(" DLA KONIA");

       kon.dzwiek();
       kon.przemieszczanie();
       kon.karmieniePotomstrwa();
       kon.dzwiek();
       kon.temperaturaCiala();


    }
}
