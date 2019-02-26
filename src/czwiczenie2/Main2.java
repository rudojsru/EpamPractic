package czwiczenie2;
import java.util.Random;

public class Main2 {
   protected static boolean flag= false;


    public static void main(String[] args) throws InterruptedException {
        TextReader tr =new TextReader();
        tr.linesReader();
        Flag2 flags =new Flag2();
        new Thread(flags).start();
        int indexNumberFromText=0;
        while (!flag){
           int[] l= tr.givengNumber(indexNumberFromText);
            System.out.println(l[0]+"   "+l[1]);
          int numbersFromRandom = randomNubers(l[0],l[1]);
              tr.answers(indexNumberFromText+1,numbersFromRandom);
           if(indexNumberFromText<l.length){
               indexNumberFromText +=2;
           }else indexNumberFromText=0;
        }
        tr.givengNumber(1);


    }

    //method that retrieves a random number from the table
    private static int randomNubers(int x,int y) throws InterruptedException {

        Random rand = new Random();
        int a = rand.nextInt(y - x + 1) + x;
        System.out.println(a);
        Thread.sleep(a * 1000);
        return a;
    }

}
