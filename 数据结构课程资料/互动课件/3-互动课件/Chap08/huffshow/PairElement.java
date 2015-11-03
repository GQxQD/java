/**
 * Class: PairElement
 *
 * Used as a tuple data structure for storing values in PriorityQueue.
 */
class PairElement extends Object {
    int key;  // char index in ALPH_STRING
    int freq; // # recurrences of this char in source data

    /**
     * PairElement
     *
     * Simple constructor.
     */
    public PairElement(int key, int freq) {
	super();

	this.key = key;
	this.freq = freq;
    }
}