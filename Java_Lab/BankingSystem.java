class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } 
        else {
            System.out.println("Insufficient funds!");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void addInterest() {
        balance += balance * interestRate / 100;
        System.out.println("Interest added at rate: " + interestRate + "%");
    }
}

class FixedDepositAccount extends SavingsAccount {
    int maturityPeriod; 
    FixedDepositAccount(String accountNumber, double balance, double interestRate, int maturityPeriod) {
        super(accountNumber, balance, interestRate);
        this.maturityPeriod = maturityPeriod;
    }

    void calculateMaturityAmount() {
        double maturityAmount = balance;

        for (int i = 0; i < maturityPeriod; i++) {
            maturityAmount += maturityAmount * interestRate / 100;
        }

        System.out.println("Maturity Amount after " + maturityPeriod + " months: " + maturityAmount);
    }
}

public class BankingSystem {
    public static void main(String[] args) {

        FixedDepositAccount acc = new FixedDepositAccount("ACC12345", 10000, 5, 12);

        acc.displayBalance();
        acc.deposit(5000);
        acc.addInterest();
        acc.displayBalance();
        acc.calculateMaturityAmount();
    }
}
