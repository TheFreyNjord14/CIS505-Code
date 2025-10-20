package Module_6;

import java.util.ArrayList;
import java.util.List;

public class MemComposerDao implements ComposerDao
{
    private List<Composer> composers;

    /**
     * Creates a default MemComposerDao with a list of five preset Composer objects
     */
    public MemComposerDao()
    {
        composers = new ArrayList<Composer>();
        composers.add(new Composer(1007, "Ludwig Van Beethoven", "Classical"));
        composers.add(new Composer(1008, "Johann Sebastian Bach", "Classical"));
        composers.add(new Composer(1009, "Wolfgang Amadeus Mozart", "Classical"));
        composers.add(new Composer(1010, "Johannes Brahms", "Classical"));
        composers.add(new Composer(1011, "Joseph Haydn", "Classical"));
    }

    /**
     * Returns a list of composers
     * @return composers List
     */
    @Override
    public List<Composer> findAll() 
    {
        return composers;
    }

    /**
     * Returns a specific composer based on the id provided
     * @param key Integer
     * @return composer Composer
     */
    @Override
    public Composer findBy(Integer key)
    {
        int i = 0;
        for(Composer c : composers)
        {
            if (c.getId() == key)
            {
                break;
            }
            i++;
            if (i == composers.size())
            {
                System.out.println("  Error: Composer Not Found, Returning Blank Composer.");
                return new Composer();
            }
        }
        return composers.get(i);
    }

    /**
     * Adds the Composer object provided to the list of composers
     * @param entity Composer
     */
    @Override
    public void insert(Composer entity) 
    {
        composers.add(entity);
    }
}
