import java.util.Scanner;

class BankAccount
{
    private double balance;

    public BankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount)
    {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful. New balance: $" + balance);
    }

    public void withdraw(double amount)
    {
        if (balance >= amount)
        {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
        } else
        {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }
}

public class Assignment_3
{
    private BankAccount bankAccount;
    private Scanner scanner;

    public Assignment_3(BankAccount bankAccount)
    {
        this.bankAccount = bankAccount;
        this.scanner = new Scanner(System.in);
    }

    public void displayOptions()
    {
        System.out.println("\nATM Options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void performAction(int choice)
    {
        switch (choice)
        {
            case 1:
                checkBalance();
                break;
            case 2:
                deposit();
                break;
            case 3:
                withdraw();
                break;
            case 4:
                System.out.println("Thank you for using the ATM. Goodbye!");
                System.exit(0);
            default:
                System.out.println("Invalid option. Please try again.");
        }
    }

    public void checkBalance()
    {
        System.out.println("Your balance is: $" + bankAccount.getBalance());
    }

    public void deposit()
    {
        System.out.print("Enter deposit amount: $");

        double amount = scanner.nextDouble();
        bankAccount.deposit(amount);
    }

    public void withdraw()
    {
        System.out.print("Enter withdrawal amount: $");

        double amount = scanner.nextDouble();
        bankAccount.withdraw(amount);
    }

    public static void main(String[] args)
    {
        BankAccount userAccount = new BankAccount(1000); // Initial balance $1000

        Assignment_3 atm = new Assignment_3(userAccount);
        while (true) {
            atm.displayOptions();
            System.out.print("Enter your choice: ");
            int choice = atm.scanner.nextInt();
            atm.performAction(choice);
        }
    }
}