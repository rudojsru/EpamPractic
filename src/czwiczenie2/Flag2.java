package czwiczenie2;

import java.util.Scanner;

public class Flag2 implements Runnable {
    Scanner sc= new Scanner(System.in);


    @Override
    public void run() {
        System.out.println("For exit please provide Q");
        unnableFlag();

    }

   //method for stopping
    private static boolean unnableFlag(){
        Scanner keybord= new Scanner(System.in);

        while (true) {
            String choise = keybord.nextLine();
            if ("q".equalsIgnoreCase(choise)) {
                return Main2.flag = true;
            }
            System.out.println("Answer is not correct");
        }

    }
}
