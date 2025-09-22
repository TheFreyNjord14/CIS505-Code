/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_2.SportsTeamApp;

public class Team {
    private String teamName;
    private String[] players;
    private int playerCount;

    /**
     * Creates a Team object with a team name n and a team size of 20.
     * @param n String
     */
    public Team(String n)
    {
        teamName = n;
        players = new String[20];
        playerCount = 0;
    }


    /**
     * Adds a player to the roster if there is an open slot. Returns error message if adding player to a full roster.
     * @param p String
     */
    public void addPlayer(String p)
    {
        if (playerCount+1 < players.length)
        {
            players[playerCount] = p;
            playerCount++;
        }
        else
        {
            System.out.println("Team full, player not added.");
        }
    }

    /**
     * Returns the player roster.
     * @return String[] players
     */
    public String[] getPlayers()
    {
        return players;
    }

    /**
     * Returns the player count.
     * @return int playerCount
     */
    public int getPlayerCount()
    {
        return playerCount;
    }

    /**
     * Returns the team name.
     * @return String teamName
     */
    public String getTeamName()
    {
        return teamName;
    }
}
