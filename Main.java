import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            boolean done = false;
            do {
                    System.out.println("Enter a monetary amount without the dollar sign or 0 to exit: ");
                    try {
                            double amount = scan.nextDouble();
                            amount = amount * 100;
                            if (amount == 0) {
                                    done = true;
                                    break;
                            }
                            CashRegister register = new CashRegister();
                            register.countTheDrawer(amount);
                            System.out.println(register.toString());
                    } catch (Exception e) {
                            System.out.println("Invalid input.");
                            scan.nextLine();
                    }
            } while (!done);
    }
}