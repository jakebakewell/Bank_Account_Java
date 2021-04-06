import java.util.Random;

public class BankAccount {
    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    private static int numberOfAccounts;
    private static double totalMoney;
    private String setAccountNumber() {
        Random rand = new Random();
        String acctNumber = "";
        for (int i = 0; i < 10; i++) {
            acctNumber += rand.nextInt(10);
        }
        return acctNumber;
    }
    public BankAccount() {
        this.accountNumber = setAccountNumber();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
        numberOfAccounts++;
    }
    public static int getNumberOfAccounts() {
        System.out.println("Number of Accounts: " + numberOfAccounts);
        return numberOfAccounts;
    }
    public static double getTotalMoney() {
        System.out.println("Total money: " + totalMoney);
        return totalMoney;
    }
    public String getAccountNumber() {
        System.out.println("Account Num: " + accountNumber);
        return this.accountNumber;
    }
    public double getCheckingBalance() {
        System.out.println("Checking balance: $" + checkingBalance);
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        System.out.println("Savings balance: $" + savingsBalance);
        return this.savingsBalance;
    }
    public void depositMoney(String string, double amount) {
        if (string == "checking") {
            this.checkingBalance += amount;
            totalMoney += amount;
        }
        else if (string == "savings") {
            this.savingsBalance += amount;
            totalMoney += amount;
        }
        else {
            System.out.println("Please specify checking or savings and intended deposit amount");
        }
    }
    public void withdrawMoney(String string, double amount) {
        if (string == "checking") {
            if (this.checkingBalance >= amount) {
                this.checkingBalance -= amount;
                totalMoney -= amount;
            }
            else {
                System.out.println("Insufficient funds");
            }
        }
        else if (string == "savings") {
            if (this.savingsBalance >= amount) {
                this.savingsBalance -= amount;
                totalMoney -= amount;
            }
            else {
                System.out.println("Insufficient funds");
            }
        }
        else {
            System.out.println("Please specify checking or savings and intended withdrawal amount");
        }
    }
    public double getCheckingPlusSavingsBalance() {
        double combinedBalance = this.checkingBalance + this.savingsBalance;
        System.out.println("This is your combined balance: " + combinedBalance);
        return combinedBalance;
    }
}
