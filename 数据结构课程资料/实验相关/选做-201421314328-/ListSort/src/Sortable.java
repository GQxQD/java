
public interface Sortable<T,V> {
	V getElem(Item<T> item);
	int compare(Item<T> item1, Item<T> item2);
	void copy(Item<T> srcItem,Item<T> destItem);
	void swap(Item<T> srcItem,Item<T> destItem);
	Item<T> getFirst();
	Item<T> getLast();
	Item<T> getNextOf(Item<T> it);
	//...
	Item<T> getPrevOf(Item<T> out);
	void display();
}
