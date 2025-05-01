// Demo class with main method
public class BankTest {
    public static void main(String[] args) {
        Account myAccount = new Account(1000.0);  // Starting balance

        myAccount.displayBalance();
        myAccount.deposit(500.0);
        myAccount.withdraw(200.0);
        myAccount.withdraw(1500.0);  // This should trigger insufficient balance
        myAccount.displayBalance();
    }
}
