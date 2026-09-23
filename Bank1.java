import java.util.Scanner;

class Customer
{
    String name;

    Customer(String name)
    {
        this.name = name;
    }
}

class Account
{
    int accountNumber;
    double balance;

    Account(int accountNumber, double balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class RBI
{
    int rateOfInterest()
    {
        return 4;
    }
}

class SBI extends RBI
{
    @Override
    int rateOfInterest()
    {
        return 7;
    }
}

class Bank1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Bank name to find the rate of interest: ");
        String name = sc.nextLine();

        RBI bank;

        if (name.equalsIgnoreCase("RBI"))
        {
            bank = new RBI();
            System.out.println("RBI rate of interest is: " + bank.rateOfInterest() + "%");
        }
        else if (name.equalsIgnoreCase("SBI"))
        {
            bank = new SBI();
            System.out.println("SBI rate of interest is: " + bank.rateOfInterest() + "%");
        }
        else
        {
            System.out.println("Invalid Bank Name");
        }
    }
}