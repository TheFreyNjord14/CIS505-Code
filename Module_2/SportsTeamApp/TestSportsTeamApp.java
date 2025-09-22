/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_2.SportsTeamApp;

import java.util.Scanner;

public class TestSportsTeamApp {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Sports Team App\n");
        while (true) 
        {
            System.out.print("Enter a team name: ");
            Team team = new Team(input.nextLine());
            
            System.out.println("Enter the player names:");
            System.out.print("  hint: use commas for multiple players; no spaces>: ");
            String players = input.nextLine();

            for (String name: players.split(","))
            {
                team.addPlayer(name);
            }

            System.out.println("--Team Summary--");
            System.out.println("Number of players in team: " + team.getPlayerCount());
            System.out.print("Players on team: ");

            for (String name: team.getPlayers())
            {
                if (name != null)
                {
                    System.out.print(name + ",");
                }
            }
            System.out.println("\n");

            String con;
            while (true) 
            { 
                System.out.print("Continue? (y/n): ");
                con = input.nextLine();
                if (con.equals("y") || con.equals("n"))
                {
                    break;
                }
            }
            if(con.equals("n"))
            {
                System.out.println("End of line...");
                input.close();
                break;
            }
        }
    }
}
