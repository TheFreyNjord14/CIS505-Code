/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_4;

import java.util.Scanner;

public class TestBowlingShopApp 
{
    /**
     * Tests the Bowling Shop Application and the classes it references
     * @param args
     */
    public static void main(String[] args) 
    {
        System.out.println("  Welcome to the Bowling Shop\n\n");
        Scanner input = new Scanner(System.in);
        while(true)
        {
            displayMenu();
            String in = input.nextLine();
            System.out.println();
            if (in.equals("x"))
            {
                break;
            }

            GenericQueue<Product> products = ProductDB.getProducts(in);

            System.out.println("  --Product Listing--");
            while(products.size() > 0)
            {
                System.out.println(products.dequeue().toString() + "\n");
            }
            System.out.println();
        }
        input.close();
        System.out.println("\n  End of line...");
    }

    /**
     * Prints menu options to screen
     */
    public static void displayMenu()
    {
        System.out.print("  MENU OPTIONS\n    1. <b> Bowling Balls\n    2. <a> Bowling Bags\n    3. <s> Bowling Shoes\n    4. <x> To exit\n\n  Please choose an option: ");
    }
}
