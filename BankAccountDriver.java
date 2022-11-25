import java.util.Scanner;
import javax.swing.JOptionPane;

public class BankAccountDriver extends BankAccount {

    public BankAccountDriver(double fee, int accountNumber) {
        super(fee, accountNumber);
    }

    public static void main(String[] args) {

        enterAmount = deposit(balance);
        withdrawAmount = withdraw(balance);
        stringValues = toString(balance);

        balance = menuAccount(null);
        
        Scanner keyboard = new Scanner(System.in);
        BankAccount account[] = new BankAccount[6];
    }

    public static int menuAccount(Scanner keyboard) {
         JOptionPane.showMessageDialog(null, "Select Account Type \n" + "1.Checking account\n" + "2. Savings account\n"
                + "3. Deposit\n" + "4. withdraw");

        int choice;
        do { 
            JOptionPane.showInputDialog(null, "Enter number: ");
            choice = keyboard.nextInt();
        } while (choice < 1 || choice > 2);

        return choice;
    }

    // Function to create a new account for client
    public static BankAccount createAccount(Scanner keyboard) {
        BankAccount account = null;
        int choice = menuAccount(keyboard);

        int accountNumber;
        JOptionPane.showMessageDialog(null, "Enter account number: ");
        accountNumber = keyboard.nextInt();

        if (choice == 1) { // checking account

            JOptionPane.showMessageDialog(null, "Enter transaction fee: ");
            double fee = keyboard.nextDouble();
            account = new BankAccount(fee, accountNumber);
        } else if (choice == 2) // saving account
        {
            JOptionPane.showMessageDialog(null, "Enter Interest Rate: ");
            double ir = keyboard.nextDouble();
            account = new BankAccount(ir, accountNumber);

        } else if (choice == 3) {
            JOptionPane.showMessageDialog(null, "Deposit option ");
            double enterAmount = keyboard.nextDouble();
            account = new BankAccount(enterAmount, accountNumber);

        } else if (choice == 4)

        {
            JOptionPane.showMessageDialog(null, "Withdraw option ");
            double withdrawAmount = keyboard.nextDouble();
            account = new BankAccount(withdrawAmount, accountNumber);

        }
        return account;

    }

}
