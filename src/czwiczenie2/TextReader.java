package czwiczenie2;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TextReader {
    public static List lines;


    //a method for reading the full fail
   public void linesReader() {
        try {
            final String TEXT = trackToFiles()+"Riddle";    //
             lines = Files.readAllLines(Paths.get("Riddle"), StandardCharsets.UTF_8);
           // System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not fount");
        }
        if (lines==null){
            System.out.println("File is empty ");
            return;
        }
    }

    //the method tops the list (list -> text) and gets the correct row one from the list
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
   //Shows the correct answer. (number from rundom)
    public void answers(int fromText,int numberFromRandom) {
         List list = new ArrayList();
        String st= (String) lines.get(fromText);
        for ( String s:st.split(",")) {
            list.add(s);
        }
        System.out.println(list.get(numberFromRandom));


    }
// to run the file from anywhere
    public static String trackToFiles() {
        String track = new File(".").getAbsolutePath();
        // System.out.println(track);

        String[] splitTrack = track.split("");
        //   System.out.println(splitTrack.length);
        track = "";


        for (int i = 0; i < splitTrack.length - 1; i++) {
            track += splitTrack[i];

        }


        System.out.println(track);
        return track;
    }
}
