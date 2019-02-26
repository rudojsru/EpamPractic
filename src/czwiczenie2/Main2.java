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
           randomNubers(l[0],l[1]);
           if(indexNumberFromText<l.length){
               indexNumberFromText++;
           }else indexNumberFromText=0;
        }
        tr.givengNumber(1);


    }


    private static void randomNubers(int x,int y) throws InterruptedException {

        Random rand = new Random();
        int a = rand.nextInt(y - x + 1) + x;
        System.out.println(a);
        Thread.sleep(a * 1000);
    }

}
