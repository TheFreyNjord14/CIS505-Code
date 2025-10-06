/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_4;

public class Bag extends Product {
    private String type;

    /**
     * Creates a default Bag with a blank code, type, and description and price 0
     */
    public Bag()
    {
        super();
        type = "";
    }

    /**
     * Returns the type field
     * @return String type
     */
    public String getType()
    {
        return type;
    }

    /**
     * Sets the type field to the value provided
     * @param x String
     */
    public void setType(String x)
    {
        type = x;
    }

    /**
     * Returns a string representation of the bag
     */
    @Override
    public String toString() {
        return super.toString() + "\n  Type: " + type;
    }
}
