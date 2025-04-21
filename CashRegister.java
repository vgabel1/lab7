public class CashRegister {
    double tens, fives, ones, quarters, dimes, nickels, pennies;

    public CashRegister() {
        this.tens = 0;
        this.fives = 0;
        this.ones = 0;
        this.quarters = 0;
        this.dimes = 0;
        this. nickels = 0;
        this.pennies = 0;
    }

    public void countTheDrawer(double amount) {
        this.tens = amount / 1000;
        amount = amount % 1000;
        this.fives = amount / 500;
        amount = amount % 500;
        this.ones = amount / 100;
        amount = amount % 100;
        this.quarters = amount / 25;
        amount = amount % 25;
        this.dimes = amount / 10;
        amount = amount % 10;
        this.nickels = amount / 5;
        amount = amount % 5;
        this.pennies = amount;
    }

    public String toString() {
        return "Tens: " + (int)this.tens +
                "\nFives: " + (int)this.fives +
                "\nOnes: " + (int)this.ones +
                "\nQuarters: " + (int)this.quarters +
                "\nDimes: " + (int)this.dimes +
                "\nNickels: " + (int)this.nickels +
                "\nPennies: " + (int)this.pennies;
    }
}
