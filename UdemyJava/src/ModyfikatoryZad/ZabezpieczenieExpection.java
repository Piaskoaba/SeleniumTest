package ModyfikatoryZad;

public class ZabezpieczenieExpection extends RuntimeException{

    public ZabezpieczenieExpection(){
        super("Promień nie moze być uyjemny");
    }
}
