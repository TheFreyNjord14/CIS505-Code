/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_3;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String zip;

    /**
     * Creates a default Customer object with a name of John Doe, an address of 1234 Nameless St., a city of New York, and a zip code of 11111.
     */
    public Customer()
    {
        name = "John Doe";
        address = "1234 Nameless St.";
        city = "New York";
        zip = "11111";
    }

    /**
     * Creates a default Customer object with a name of n, an address of a, a city of c, and a zip code of z.
     * @param n String
     * @param a String
     * @param c String
     * @param z String
     */
    public Customer(String n, String a, String c, String z)
    {
        name = n;
        address = a;
        city = c;
        zip = z;
    }

    /**
     * Returns the name of the customer.
     * @return String name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the address of the customer.
     * @return String address
     */
    public String getAddress()
    {
        return address;
    }

    /**
     * Returns the city of the customer.
     * @return String city
     */
    public String getCity()
    {
        return city;
    }

    /**
     * Returns the zip code of the customer.
     * @return String zip
     */
    public String getZip()
    {
        return name;
    }

    /**
     * Sets the customer name to the provided value.
     * @param x String
     */
    public void setName(String x)
    {
        name = x;
    }

    /**
     * Sets the customer address to the provided value.
     * @param x String
     */
    public void setAddress(String x)
    {
        address = x;
    }

    /**
     * Sets the customer city to the provided value.
     * @param x String
     */
    public void setCity(String x)
    {
        city = x;
    }

    /**
     * Sets the customer zip code to the provided value.
     * @param x String
     */
    public void setZip(String x)
    {
        zip = x;
    }

    /**
     * Returns a string representation of the customer detailing name, address, city, and zip code on new lines.
     * @return String
     */
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nCity" + city + "\nZip: " + zip;
    }
}
