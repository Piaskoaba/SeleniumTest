package CheckUncheck;

import java.io.*;
import java.sql.SQLException;

public class CheckUncheckMain {
    public static void main(String args[]) {
        File file = new File("lokalizacja pliku");

        // check exceptions
        try {
            InputStream inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();



            //uncheck exceptions
            // NullPointerException ; ArrayIndexOutOfBoundsException

        }
    }
}






