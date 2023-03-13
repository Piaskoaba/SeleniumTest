package ModyfikatoryZad;

import WyjatkiZadania.Przez0Exception;

public class Zadanie3 {

    public static final double PI = 3.14;


    public static double obwodKola (double promien) throws ZabezpieczenieExpection {

        if(promien <0){
            throw new ZabezpieczenieExpection();

        }

        promien = 2*PI*promien;
        return  promien;

    }

    public static double poleKola(double promien){
        return PI*promien*promien;                      //skrocony zapis
    }





}
