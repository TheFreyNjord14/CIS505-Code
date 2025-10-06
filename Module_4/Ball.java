/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_4;

public class Ball extends Product {
    private String color;

    /**
     * Creates a default Ball with a blank code, color, and description and price 0
     */
    public Ball()
    {
        super();
        color = "";
    }

    /**
     * Returns the color field
     * @return String color
     */
    public String getColor()
    {
        return color;
    }

    /**
     * Sets the color field to the value provided
     * @param x String
     */
    public void setColor(String x)
    {
        color = x;
    }

    /**
     * Returns a string representation of the ball
     */
    @Override
    public String toString() {
        return super.toString() + "\n  Color: " + color;
    }
}
