/* 
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures:
    Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modifications by R. Krasso, 2021
    
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_5;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class TransactionIO {
    private static final String FILE_NAME = "expenses.txt";
    private static File file = new File(FILE_NAME);

    /**
     * Takes in an array of transactions and outputs them to a text file
     * @param transactions ArrayList<Transaction>
     * @throws IOException
     */
    public static void bulkInsert(ArrayList<Transaction> transactions) throws IOException
    {
        PrintWriter output = null;

        if (file.exists())
        {
            output = new PrintWriter(new FileOutputStream(file, true));
        }
        else
        {
            output = new PrintWriter(FILE_NAME);
        }

        for (Transaction tran : transactions)
        {
            output.print(tran.getDate() + " ");
            output.print(tran.getDescription() + " ");
            output.println(tran.getAmount());
        }

        output.close();
    }

    /**
     * Returns a list of all transactions documented in the selected text file
     * @return ArrayList<Transaction> transactions
     * @throws IOException
     */
    public static ArrayList<Transaction> findAll() throws IOException
    {
        Scanner input = new Scanner(file);

        ArrayList<Transaction> transactions = new ArrayList<Transaction>();

        while(input.hasNext())
        {
            Transaction t = new Transaction();
            t.setDate(input.next());
            t.setDescription(input.next());
            t.setAmount(input.nextDouble());

            transactions.add(t);
        }

        return transactions;
    }
}
