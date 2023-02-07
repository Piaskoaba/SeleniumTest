package GerrersAndSetters;

import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void gettersAndSettersTest() {

        Customer customer = new Customer();
        int age = 15;
        customer.setAge(age);
        System.out.println(" Wiek to: " + customer.getAge());
        age = 22;
        System.out.println(" Wiek to: " + customer.getAge());
    }


    @Test
    public void gettersAndSettersTestObjectsTest() {

        Customer customer = new Customer();
        Address address = new Address("Kraków", "Fiołkowa", "15/22");
        customer.setAddress(address);
        System.out.print("Adres: "+
        customer.getAddress().getStreet() + " " +
        customer.getAddress().getApartment() + " " +
        customer.getAddress().getCity());

    }
}




