public class DLinkList implements Sortable<Link, Long> {
	private Link first;
	private Link last;

	public DLinkList() {
		first = null;
		last = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insert(long d) {
		Link newLink = new Link(d);
		if (isEmpty())
			first = newLink;
		else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}

	public Long getElem(Item<Link> item) {
		return item.getPos().dData;
	}

	public int compare(Item<Link> item1, Item<Link> item2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void copy(Item<Link> srcItem, Item<Link> destItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public void swap(Item<Link> srcItem, Item<Link> destItem) {
		// TODO Auto-generated method stub

	}

	@Override
	public Item<Link> getFirst() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item<Link> getLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item<Link> getNextOf(Item<Link> it) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item<Link> getPrevOf(Item<Link> out) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub

	}

}