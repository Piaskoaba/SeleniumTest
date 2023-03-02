public class Zad1 {
    public static void main(String[] args) {

        int age = 33;
        double weight = 95.5;
        double height = 188;
        System.out.println(age + " lat " + weight + " kg " + height + " cm .");

        double BMI = weight / (height * 2) * 100;

        System.out.println(" BMI = " + BMI);

        int BMI2 = (int) weight / (int) ((height * 2) * 100);
        System.out.println(" BMI 2  = : " + BMI2);


        int number = 100;

        double Result = number / 2;
        System.out.println("result: " + Result);
        double Result2 = number / 3;
        System.out.println("result2: " + Result2);
        double Result3 = number % 11;
        System.out.println(" result: "+ Result3);




    }
}
