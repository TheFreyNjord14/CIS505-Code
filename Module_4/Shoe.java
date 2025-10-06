/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_4;

public class Shoe extends Product {
    private double size;

    /**
     * Creates a default Shoe with a blank code and description, size 0, and price 0
     */
    public Shoe()
    {
        super();
        size = 0;
    }

    /**
     * Returns the size field
     * @return double size
     */
    public double getSize()
    {
        return size;
    }

    /**
     * Sets the size field to the value provided
     * @param x double
     */
    public void setSize(double x)
    {
        size = x;
    }

    /**
     * Returns a string representation of the bag
     */
    @Override
    public String toString() {
        return super.toString() + "\n  Size: " + size;
    }
}
