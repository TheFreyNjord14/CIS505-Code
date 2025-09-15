/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_1.Fan;

public class Fan {
    private static final int STOPPED = 0;
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     * Returns the current speed of the fan.
     * @return int speed
     */
    public int getSpeed() 
    {
        return speed;
    }

    /**
     * Returns whether the fan is currently on or off.
     * @return boolean on
     */
    public boolean getOn() 
    {
        return on;
    }

    /**
     * Returns the radius of the fan.
     * @return double radius
     */
    public double getRadius() 
    {
        return radius;
    }

    /**
     * Returns the color of the fan.
     * @return String color
     */
    public String getColor() 
    {
        return color;
    }

    /**
     * Takes an integer value between 0 and 3 and sets the fan speed to that value.
     * @param x int
     */
    public void setSpeed(int x)
    {
        if(x<=3 && x>=0)
        {
            speed = x;
        }
        else
        {
            throw new IllegalArgumentException("Input value must fall between 0 and 3.");
        }
    }

    /**
     * Sets the fan to on or off depending on the boolean value input.
     * @param x boolean
     */
    public void setOn (boolean x)
    {
        on = x;
    }

    /**
     * Takes a double value greater than 0 and sets the fan radius to that value.
     * @param x double
     */
    public void setRadius (double x)
    {
        if (x>0)
        {
            radius = x;
        }
        else
        {
            throw new IllegalArgumentException("Input value must be greater than 0.");
        }
    }

    /**
     * Sets the fan color the the string value input.
     * @param x String
     */
    public void setColor (String x)
    {
        color = x;
    }

    /**
     * Creates a default Fan object with speed of 0, turned off, radius of 6, and color white.
     */
    public Fan()
    {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    /**
     * Creates a Fan object with a speed of s, on of o, radius of r, color of c. s must be between 0 and 3. r must be greater than 0.
     * @param s int
     * @param o boolean
     * @param r double
     * @param c String
     */
    public Fan(int s, boolean o, double r, String c)
    {
        if(s<0 || s>3 || r<=0)
        {
            throw new IllegalArgumentException("Invalid argument used.");
        }
        else
        {
            speed = s;
            on = o;
            radius = r;
            color = c;
        }
    }

    @Override
    public String toString() {
        String s;
        if(on)
        {
            return "The " + color + ", " + radius + " inch fan is turned on at fan speed " + speed + ".";
        }
        else
        {
            return "The " + color + ", " + radius + " inch fan is off.";
        }
    }
}
