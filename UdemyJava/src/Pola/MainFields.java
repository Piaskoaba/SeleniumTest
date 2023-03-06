package Pola;

public class MainFields {

    public static void main (String[] args) {

        Fields object = new Fields();
        object.IntergerNumber = 15;
        System.out.println(object.IntergerNumber);

        object.fieldReturn();
        object.setReturnInterger(105);
        System.out.println(object.IntergerNumber);


        object.setReturnInterger(205);
        int IntergerNumber2 = object.ValueFromMethod();
        System.out.println("Zmienna " + IntergerNumber2);
    }



}
