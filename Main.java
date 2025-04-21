import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a monetary amount without the dollar sign: ");
            double input = scan.nextDouble();

            int amount = (int)(input * 100);
            int tens = amount / 1000;
            amount = amount % 1000;
            int fives = amount / 500;
            amount = amount % 500;
            int ones = amount / 100;
            amount = amount % 100;
            int quarters = amount / 25;
            amount = amount % 25;
            int dimes = amount / 10;
            amount = amount % 10;
            int nickels = amount / 5;
            amount = amount % 5;
            int pennies = amount;

            System.out.println("Ten dollar bills: " + tens);
            System.out.println("Five dollar bills: " + fives);
            System.out.println("One dollar bills: " + ones);
            System.out.println("Quarters: " + quarters);
            System.out.println("Dimes: " + dimes);
            System.out.println("Nickels: " + nickels);
            System.out.println("Pennies: " + pennies);

    }
}