//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        main work
        Scanner scanner = new Scanner(System.in);
        inventory inv = new inventory();
        Optional<items> item;
        System.out.println("Welcome to the Store: ");
        String answer;
        do {
            System.out.println("This it what we currently have in store");
            inv.getInventory();
            System.out.println("Would you like to (B)uy or (S)ell or (Q)uit");
            answer = scanner.nextLine().toLowerCase();

            switch (answer){
                case "b":
                    System.out.println("Which item would you like to buy: ");
                    String item_name = scanner.next();
                    item = inv.getItem(item_name);
            }
            if (answer.equals("quit")) {
                answer = "q";
            }
        } while (!answer.equals("q"));
    }
}