package GerrersAndSetters;

public class Customer {

    private String name;
    private String lastName;
   private int age;
   private Address address;  // typ referencyjny Address

    public Address getAddress() {   //metoda ktora zwraca np.adres =getter
        return address;
    }
    public void setAddress(Address addressParameter) {   // metoda ktora ustawia np.adres  =setter

        address = addressParameter;

        }

    public void setAge(int ageParameter) {

    if (ageParameter<0) {
        throw new IllegalArgumentException(" Wiek nie moze byc ujemny");
    }
    age = ageParameter;
    }

    public int getAge() {
        return  age;
    }
}
