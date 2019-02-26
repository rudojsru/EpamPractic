import java.util.List;
import java.util.Random;

public class Main {
   protected static boolean flag= false;


    public static void main(String[] args) throws InterruptedException {
        TextReader textReader =new TextReader();
        Flag flags =new Flag();
        new Thread(flags).start();
        while (!flag){
           randomNubers(1,6);
        }
        List list = textReader.lines;
        System.out.println(list);
        textReader.printList();

    }


    private static void randomNubers(int x,int y) throws InterruptedException {

        Random rand = new Random();
        int a = rand.nextInt(y - x + 1) + x;
        System.out.println(a);
        Thread.sleep(a * 1000);
    }

}
