/* 
    Wilkins, S (2025). CIS 505 Intermediate Java Programming. Bellevue University.
*/
package Module_4;

import java.util.LinkedList;

public class GenericQueue<T> {
    private LinkedList<T> list = new LinkedList<T>();

    /**
     * Queues the provided item into the queue
     * @param item
     */
    public void enqueue(T item)
    {
        list.addFirst(item);
    }

    /**
     * Returns the first item in the queue and removes it from the queue
     * @return T item
     */
    public T dequeue()
    {
        return list.removeFirst();
    }

    /**
     * Returns the size of the queue
     * @return int size
     */
    public int size()
    {
        return list.size();
    }
}
