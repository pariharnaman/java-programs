class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    protected void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance.");
    }

    void checkBalance() {
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.withdraw(2000);
        account.checkBalance();
        // account.balance is not accessible directly due to private access
    }
}
