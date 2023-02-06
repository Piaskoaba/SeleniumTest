package GerrersAndSetters;

public class Customer {

    private String name;
    private String lastName;
private int age;


    public void setAge(int ageParameter) {
age =ageParameter;
    if (ageParameter<0) throw new IllegalArgumentException();
    age= ageParameter;
    }

    }

