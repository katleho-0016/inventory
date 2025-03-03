//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        main work
        Scanner scanner = new Scanner(System.in);
        inventory inv = new inventory();
        System.out.println("Welcome to the Store: ");
        String answer;
        do {
            System.out.println("This it what we currently have in store");
            inv.getInventory();
            System.out.println("Would you like to (B)uy or (S)ell or (Q)uit");
            answer = scanner.nextLine().toLowerCase();
            if (answer.equals("quit")) {
                answer = "q";
            }
        } while (!answer.equals("q"));
    }
}