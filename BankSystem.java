class Account
{
    int accountNumber;
    String accountHolder;
    double balance;
    String accountType;
    Account(int accountNumber, String accountHolder, double balance, String accountType)
    {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }
    void deposit(double amount)
    {
        if (amount > 0){
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }
        else{
            System.out.println("Invalid amount");
        }
    }
    void withdraw(double amount){
        if (amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void calculateInterest(){
        System.out.println("Interest calculation is not available");
    }
    void transfer(Account receiver, double amount){
            receiver.balance = receiver.balance + amount;

            System.out.println("Transferred: " + amount);
            System.out.println("Transfer successful");
        }
        else{
            System.out.println("Transfer failed");
        }
    }
    void display(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account{
    double interestRate;

    SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate){
        super(accountNumber, accountHolder, balance, "Savings");
        this.interestRate = interestRate;
    }

    @Override
    void calculateInterest()
    {
        double interest = balance * interestRate / 100;
        balance = balance + interest;

        System.out.println("Interest: " + interest);
        System.out.println("Balance after interest: " + balance);
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends Account
{
    double overdraftLimit;

    CurrentAccount(int accountNumber, String accountHolder, double balance, double overdraftLimit)
    {
        super(accountNumber, accountHolder, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    void withdraw(double amount)
    {
        if (amount > 0 && amount <= balance + overdraftLimit)
        {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        }
        else
        {
            System.out.println("Overdraft limit exceeded");
        }
    }

    @Override
    void display()
    {
        super.display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class BankSystem
{
    public static void main(String[] args)
    {
        SavingsAccount s = new SavingsAccount(
            1001, "Rahul", 10000, 5
        );

        CurrentAccount c = new CurrentAccount(
            1002, "Amit", 5000, 3000
        );

        System.out.println("----- SAVINGS ACCOUNT -----");
        s.display();

        System.out.println("\nDeposit");
        s.deposit(2000);

        System.out.println("\nWithdraw");
        s.withdraw(1000);

        System.out.println("\nInterest");
        s.calculateInterest();

        System.out.println("\n----- CURRENT ACCOUNT -----");
        c.display();

        System.out.println("\nDeposit");
        c.deposit(2000);

        System.out.println("\nWithdraw");
        c.withdraw(9000);

        System.out.println("\n----- TRANSFER -----");
        s.transfer(c, 2000);

        System.out.println("\n----- FINAL DETAILS -----");

        System.out.println("\nSavings Account:");
        s.display();

        System.out.println("\nCurrent Account:");
        c.display();
    }
}
