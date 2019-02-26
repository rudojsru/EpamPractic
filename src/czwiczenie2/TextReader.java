package czwiczenie2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextReader {
    public static List lines;

   public void linesReader() {
        try {

             lines = Files.readAllLines(Paths.get("Readmy.txt"), StandardCharsets.UTF_8);
           // System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error");
        }
    }

    public  int[] givengNumber(int i) {
        int arrayFinfNumbers [] = new int[2] ;
        String st= (String) lines.get(i);
        String [] numbInt=st.split("");
        for (int j = 0; j < numbInt.length; j++) {
            if (numbInt[0].equalsIgnoreCase("t")){
                if (numbInt[j].equalsIgnoreCase("=")){
                    String number="";
                    j++;
                    while (!numbInt[j].equalsIgnoreCase(",")){
                        number +=numbInt[j];
                        j++;
                    }

                    int k = Integer.parseInt(number);

                    arrayFinfNumbers[0] = k;
                    if ( numbInt[j].equalsIgnoreCase(",")){
                        number="";
                        j++;
                        while ( j <numbInt.length){
                            number +=numbInt[j];
                            j++;
                        }
                        arrayFinfNumbers[1] = Integer.parseInt(number);
                    }
                }
            }
        }

        return arrayFinfNumbers;
    }

}
