import java.util.ArrayList;

import javax.swing.JOptionPane;

public class BankAccount {

    static double balance; // Account balance
    String id; // Identyfikator klienta
    public static String amountDeposit ,amountWithdraw, name;
    protected static double enterAmount;
    protected static double withdrawAmount;
    protected static String stringValues;
    static double value = enterAmount - withdrawAmount;
    private ArrayList<BankAccount> accounts;

    public BankAccount(double fee, int accountNumber) {
    }

    public static double deposit(double amount) {
        name  = JOptionPane.showInputDialog("Please enter your name");
        if (amount > 0) {
            balance += amount;
        } else {
            amountDeposit = JOptionPane.showInputDialog("Enter amount to deposit");
        }

        return enterAmount;
    }

    public static double withdraw(double amount) {

        if (amount <= balance) {

            amountWithdraw = JOptionPane.showInputDialog(
                    "Enter amount to withdraw");

        }            
        
         else if (balance - amount < 500) {
             JOptionPane.showMessageDialog(null, "Withdrawl is not not permitted");
            
         }
        else {
            balance -= amount;
        }
        
        return withdrawAmount;
    }

    public void close() {


    }

    public static String toString(double balance) {
        JOptionPane.showMessageDialog(null,String.format( "Hello " + name + " your total balance is:  " + value) );
        return stringValues;
    }

}