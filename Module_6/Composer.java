/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_6;

public class Composer 
{
    private int id;
    private String name;
    private String genre;

    /**
     * Creates a default Composer with an id of 0, a blank name, and a blank genre
     */
    public Composer()
    {
        id = 0;
        name = "";
        genre = "";
    }

    /**
     * Creates a Composer with an id of i, a name of n, and a genre of g
     * @param i int
     * @param n String
     * @param g String
     */
    public Composer(int i, String n, String g)
    {
        id = i;
        name = n;
        genre = g;
    }

    /**
     * Returns the id field
     * @return int id
     */
    public int getId()
    {
        return id;
    }

    /**
     * Returns the name field
     * @return String name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the genre field
     * @return String genre
     */
    public String getGenre()
    {
        return genre;
    }

    /**
     * Returns a string representation of the composer
     */
    @Override
    public String toString() {
        return "  Id: " + id + "\n  Name: " + name + "\n  Genre: " + genre;
    }
}
