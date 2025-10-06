/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_4;

public class Product {
    private String code;
    private String description;
    private double price;

    /**
     * Creates a default Product with a blank code and description and price 0
     */
    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }

    /**
     * Returns the code field
     * @return String code
     */
    public String getCode()
    {
        return code;
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
     * Returns the price field
     * @return double price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Sets the code field to the value provided
     * @param x String
     */
    public void setCode(String x)
    {
        code = x;
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
     * Sets the price field to the value provided
     * @param x double
     */
    public void setPrice(double x)
    {
        price = x;
    }

    /**
     * Returns a string representation of the product
     */
    @Override
    public String toString() {
        return String.format("  Product code: %s\n  Description: %s\n  Price: $%,6.2f",code, description, price);
    }
}
