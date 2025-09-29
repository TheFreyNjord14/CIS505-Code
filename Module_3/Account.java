/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_3;

public class Account {
    private double balance;

    /**
     * Creates an Account object with balance of $200
     */
    public Account()
    {
        balance = 200;
    }

    /**
     * Returns the name of the customer.
     * @return double balance
     */
    public double getBalance()
    {
        return balance;
    }

    /**
     * Sets the account balance to the provided value.
     * @param double x
     */
    public void setBalance(double x)
    {
        balance = x;
    }

    /**
     * Increases the balance by the amount provided.
     * @param amt
     */
    public void deposit(double amt)
    {
        balance += amt;
    }

    /**
     * Decreases the balance by the amount provided if there is enough money to withdraw.
     * @param amt
     */
    public void withdraw(double amt)
    {
        if(balance >= amt)
        {
            balance -= amt;
        }
    }

    /**
     * Prints a menu detailing the options possible with this object
     */
    public void displayMenu()
    {
        System.out.print("Account Menu\nEnter <D/d> for deposit\nEnter <W/w> for withdraw\nEnter <B/b> for balance\n  Enter option>: ");
    }

    /**
     * Returns a set transaction date
     * @return String
     */
    public String getTransactionDate()
    {
        return "01-01-2001";
    }
}
