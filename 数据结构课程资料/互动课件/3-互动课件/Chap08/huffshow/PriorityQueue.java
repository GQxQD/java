/**
 * Class: PriorityQueue
 *
 * Very simple implementation of a Priority Queue.  Inefficient but effective.
 * Relies on the java.util.Vector class for most of its functionality.
 */
import java.util.Vector;

class PriorityQueue extends Vector {
    /**
     * PriorityQueue
     *
     * Default constructor.
     */
    public PriorityQueue() {
	super();
    }

    /**
     * insert
     *
     * Insert an element into priority queue.  We insert the element into
     * the proper location so as to maintain the priority queue's order in
     * a min..max sequence (ordered by frequency.)
     */
    public void insert(PairElement elem) {
	int i;

	i = 0;
	while(i < size() &&
	  ((PairElement) elementAt(i)).freq < elem.freq) {
	    i++;
	}

	insertElementAt(elem, i);
    }

    /**
     * removeMin
     *
     * Remove minimum (frequency) element from priority queue, and
     * return a reference to it.
     */
    public PairElement removeMin() {
	PairElement e;

	if(size() > 0) {
	    e = (PairElement) firstElement();
	    removeElementAt(0);

	    return e;
	} else {
	    return null;
	}
    }
}

