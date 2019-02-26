import java.util.Scanner;

public class Flag implements Runnable {
    Scanner sc= new Scanner(System.in);


    @Override
    public void run() {
        System.out.println("For exit please provide Q");
        unnableFlag();

    }


    private static boolean unnableFlag(){
        Scanner keybord= new Scanner(System.in);

        while (true) {
            String choise = keybord.nextLine();
            if ("q".equalsIgnoreCase(choise)) {
                return Main.flag = true;
            }
            System.out.println("Answer is not correct");
        }

    }
}
