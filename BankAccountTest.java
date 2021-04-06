public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount jake = new BankAccount();
        BankAccount bob = new BankAccount();
        BankAccount.getNumberOfAccounts();
        jake.getAccountNumber();
        jake.depositMoney("checking", 1000.50);
        jake.depositMoney("savings", 500.75);
        jake.withdrawMoney("checking", 200.50);
        jake.getCheckingBalance();
        jake.getSavingsBalance();
        jake.getCheckingPlusSavingsBalance();
        bob.getAccountNumber();
        bob.depositMoney("checking", 1200.25);
        bob.depositMoney("savings", 800.50);
        bob.withdrawMoney("checking", 100.75);
        BankAccount.getTotalMoney();
    }
}
