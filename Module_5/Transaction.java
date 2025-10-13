/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_5;

public class Transaction {
    private String date;
    private String description;
    private double amount;

    /**
     * Returns the date field
     * @return String date
     */
    public String getDate()
    {
        return date;
    }

    /**
     * Sets the date field to the value provided
     * @param x String
     */
    public void setDate(String x)
    {
        date = x;
    }

    /**
     * Returns the description field
     * @return String description
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Sets the description field to the value provided
     * @param x String
     */
    public void setDescription(String x)
    {
        description = x;
    }

    /**
     * Returns the amount field
     * @return double date
     */
    public double getAmount()
    {
        return amount;
    }

    /**
     * Sets the amount field to the value provided
     * @param x double
     */
    public void setAmount(double x)
    {
        amount = x;
    }

    /**
     * Creates a default Transaction with a date of today, a blank description, and an amount of 0
     */
    public Transaction()
    {
        date = "10-12-2025";
        description = "";
        amount = 0;
    }

    /**
     * Creates a Transaction with a date of d1, a description of d2, and amount of a
     * @param d1 String date
     * @param d2 String description
     * @param a double amount
     */
    public Transaction(String d1, String d2, double a)
    {
        date = d1;
        description = d2;
        amount = a;
    }

    /**
     * Returns a string representation of the transaction
     */
    @Override
    public String toString() {
        return String.format("  Date: %s\n  Description: %s\n  Amount: $%,6.2f",date, description, amount);
    }
}
