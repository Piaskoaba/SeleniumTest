public class Zad1 {
    public static void main(String[] args) {

        int age = 33;
        float weight = 95.5f;
        float height = 1.88f;
        System.out.println(age + " lat " + weight + " kg " + height + " cm .");

        float BMI = weight / (height * height);

        System.out.println(" BMI = " + BMI);

        int BMI2 = (int) weight / (int) (height * height);
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
