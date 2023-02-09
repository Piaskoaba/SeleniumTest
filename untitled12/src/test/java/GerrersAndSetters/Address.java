package GerrersAndSetters;

public class Address {


    private String street;
    private String postalCode;

    private String apartment;
    private String city;

    public Address(String city, String street, String apartment) {
        this.street = street;           // this - przekazujemy wartosci, zeby przekazac do pola. To co po. dotyczy obiektu klasy, a nie parametru
        this.apartment = apartment;     // mozna uzywac w odniesieniu do konstruktora oraz w return
        this.city = city;
        this.postalCode = postalCode;
    }

    public Address(String city, String street, String apartment, String postalCode){
        this(city,street,apartment);
        this.postalCode = postalCode;
    }

    public String getStreet(){
        return street;
    }

    public String  getCity(){
        return city;
    }

    public String getApartment(){
        return apartment;
    }

    public void setCity(String cityName) {
        city = cityName;
    }

    public void setStreet(String street) {  //PPM generate setter
        this.street = street;
    }
    public void setApartment (String apartment) {

        this.apartment = apartment;
    }
    }



