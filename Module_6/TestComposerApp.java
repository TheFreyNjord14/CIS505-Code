/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_6;

import java.util.Scanner;

public class TestComposerApp 
{
    /**
     * Tests the Composer Application
     * @param args String[]
     */
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        MemComposerDao composers = new MemComposerDao();

        System.out.println("  Welcome to the Composer App");

        while(true)
        {
            menu();
            int i = input.nextInt();
            input.nextLine();
            if (i == 1)
            {
                System.out.println("\n  --DISPLAYING COMPOSERS--");
                for (Composer c : composers.findAll())
                {
                    System.out.println(c + "\n");
                }
            }
            else if (i == 2)
            {
                System.out.print("\n  Enter an id: ");
                Integer id = input.nextInt();
                input.nextLine();
                Composer c = composers.findBy(id);
                System.out.println("\n  --DISPLAYING COMPOSER--\n" + c);
            }
            else if (i == 3)
            {
                System.out.print("\n  Enter an id: ");
                int id = input.nextInt();
                input.nextLine();
                System.out.print("  Enter a name: ");
                String n = input.nextLine();
                System.out.print("  Enter a genre: ");
                String g = input.nextLine();

                composers.insert(new Composer(id, n, g));
            }
            else if (i == 4)
            {
                break;
            }
            else
            {
                System.out.println("  Error: Please enter a valid menu option\n");
            }
        }
        input.close();
        System.out.print("\n  Program terminated by the user...");
    }

    /**
     * Prints a menu to the console
     */
    public static void menu()
    {
        System.out.print("\n  MENU OPTIONS\n    1. View Composers\n    2. Find Composer\n    3. Add Composer\n    4. Exit\n\n  Please choose an option: ");
    }
}
