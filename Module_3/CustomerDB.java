/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_3;

public class CustomerDB {

    /**
     * Takes in an integer value representing a customer ID. If the ID is between 1007 and 1009, it returns a preset customer object, otherwise it returns the default object of the Customer class
     * @param id int
     * @return Customer
     */
    public static Customer getCustomer(int id)
    {
        if (id == 1007)
        {
            return new Customer("Dave Smith", "5324 Address Ln.", "Bellevue", "68000");
        }
        else if (id == 1008)
        {
            return new Customer("Anne Other", "232 South Rd.", "San Antonio", "55555");
        }
        else if (id == 1009)
        {
            return new Customer("Daisy Mae", "2932 15th St.", "Miami", "33333");
        }
        else
        {
            return new Customer();
        }
    }
}
