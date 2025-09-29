/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_3;

import java.util.Scanner;

/**
 * Tests the Account, Customer, and CustomerDB classes.
 */
public class TestCustomerAccountApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Customer Account App\n");

        System.out.print("Enter a customer ID\n  ex: 1007, 1008, 1009>: ");

        Customer customer = CustomerDB.getCustomer(input.nextInt());
        input.nextLine();

        Account a = new Account();
        do
        {
            System.out.println();
            a.displayMenu();
            String in = input.nextLine();
            if (in.equals("D") || in.equals("d"))
            {
                System.out.print("\nEnter deposit amount: ");
                a.deposit(input.nextInt());
                input.nextLine();
            }
            else if (in.equals("W") || in.equals("w"))
            {
                System.out.print("\nEnter withdraw amount: ");
                a.withdraw(input.nextInt());
                input.nextLine();
            }
            else if (in.equals("B") || in.equals("b"))
            {
                System.out.printf("\nAccount balance: $%,6.2f", a.getBalance());
            }
            else
            {
                System.out.print("\nError: Invalid option");
            }

            System.out.print("\n\nContinue? (y/n): ");
            if (input.nextLine().equals("n"))
            {
                break;
            }
        } while (true);

        input.close();

        System.out.println("\n\n--Customer Details--");
        System.out.println(customer.toString() + "\n");
        System.out.printf("Balance as of %s100 is $%,6.2f\n", a.getTransactionDate(), a.getBalance());
        System.out.print("End of line...");
    }
}
