package GerrersAndSetters;

public class Customer {

    private String name;
    private String lastName;
   private int age;


    public void setAge(int ageParameter) {

    if (ageParameter<0){
        throw new IllegalArgumentException(" Wiek nie moze byc ujemny");
    }
    age = ageParameter;
    }

    public String getAge() {
        return  (" Wiek to: ") + age;
    }
}

