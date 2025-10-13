/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_5;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class TestExpenseTracker {
    /**
     * Tests the Expense Tracker Application
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        String menu = "\n  MENU OPTIONS\n    1. View Transactions\n    2. Add Transactions\n    3. View Expense\n\n  Please choose an option: ";

        System.out.println("  Welcome to Expense Tracker");

        while (true)
        {
            int in = ValidatorIO.getInt(input, menu);

            if (in == 1) 
            {
                System.out.println("  MONTHLY EXPENSES\n");

                try 
                {
                    for (Transaction trans : TransactionIO.findAll())
                    {
                        System.out.println(trans.toString() + "\n");
                    }
                }
                catch (IOException e) 
                {
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            }
            else if (in == 2) 
            {
                String cont = "";
                ArrayList<Transaction> transactions = new ArrayList<Transaction>();

                while(!cont.equals("n"))
                {
                    String d1 = "10-12-2025";
                    String d2 = ValidatorIO.getString(input, "\n  Enter the description: ");
                    double a = ValidatorIO.getDouble(input, "  Enter the amount: ");

                    Transaction t = new Transaction(d1, d2, a);

                    transactions.add(t);

                    while (true)
                    {
                        cont = ValidatorIO.getString(input, "\n  Add another transaction? (y/n): ");

                        if (cont.equals("n") || cont.equals("y"))
                        {
                            System.out.println();
                            break;
                        }
                        else
                        {
                            System.out.println("\n  Error: Please enter y or n to continue or stop input");
                        }
                    }
                }

                try 
                {
                    TransactionIO.bulkInsert(transactions);
                }
                catch (Exception e) {
                    System.out.println("\n  Exception: " + e.getMessage());
                }
            }
            else if (in == 3) 
            {
                double a = 0;
                try 
                {
                    for (Transaction trans : TransactionIO.findAll())
                    {
                        a += trans.getAmount();
                    }
                }
                catch (IOException e) 
                {
                    System.out.println("\n  Exception: " + e.getMessage());
                }

                System.out.printf("\n  Your total monthly expense is $%,6.2f\n\n", a);
            }
            else
            {
                System.out.println("\n  Error: Please select a number between 1 and 3\n");
                continue;
            }

            String cont;

            while (true) 
            { 
                cont = ValidatorIO.getString(input, "  Continue? (y/n): ");    
                if (cont.equals("y") || cont.equals("n"))
                {
                    break;
                }
                else
                {
                    System.out.println("\n  Error: Please enter y or n to continue or stop");
                }
            }
            
            if (cont.equals("n"))
            {
                break;
            }
        }
        input.close();
        System.out.print("\n  Program terminated by the user...");
    }
}
