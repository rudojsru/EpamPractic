package czwiczenie2;

public class Test {

    public static void main(String[] args) {
       int a[]= givengNumber("Top1=1,5");
        for (int f:
             a) {
            System.out.println(f);

        }
    }
    public static int[] givengNumber(String i) {
        int arrayFinfNumbers [] = new int[2] ;
        String st=  i;
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
