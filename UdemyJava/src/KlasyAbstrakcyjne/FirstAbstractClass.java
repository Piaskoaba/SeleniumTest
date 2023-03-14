package KlasyAbstrakcyjne;

public abstract class FirstAbstractClass {
    public void metoda () {
        System.out.println("Zwykły tekst: ");
    }


    public abstract void metodaAbstrakcyjna();  //metoda abstrakcyjna nie ma ciala metody


    public abstract int metodaZParametrem (String z);
    }

