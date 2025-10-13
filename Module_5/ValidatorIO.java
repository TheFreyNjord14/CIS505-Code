/* 
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modifications by R. Krasso, 2021
    
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_5;

import java.util.Scanner;

public class ValidatorIO {

    /**
     * Displays the prompt message and checks for user input to verify if the user entered a valid integer
     * @param sc Scanner
     * @param prompt String
     * @return int input
     */
    public static int getInt(Scanner sc, String prompt)
    {
        int input = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                input = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("\n  Error! Invalid integer value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /**
     * Displays the prompt message and checks for user input to verify if the user entered a valid double
     * @param sc Scanner
     * @param prompt String
     * @return double input
     */
    public static double getDouble(Scanner sc, String prompt)
    {
        double input = 0;
        boolean isValid = false;
        while (!isValid)
        {
            System.out.print(prompt);
            if (sc.hasNextDouble())
            {
                input = sc.nextDouble();
                isValid = true;
            }
            else
            {
                System.out.println("\n  Error! Invalid double value.\n");
            }
            sc.nextLine();
        }
        return input;
    }

    /**
     * Displays the prompt message and returns the next user input line of text
     * @param sc Scanner
     * @param prompt String
     * @return String input
     */
    public static String getString(Scanner sc, String prompt)
    {
        String input = "";
        boolean isValid = false;

        System.out.print(prompt);
        input = sc.nextLine();

        return input;
    }
}
