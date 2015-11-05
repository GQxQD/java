public class LinkItem implements Item<LinkItem> {
	public long dData; // data item
	public LinkItem next; // next link in list
	public LinkItem previous; // previous link in list

	@Override
	public long getData() {
		// TODO Auto-generated method stub
		return dData;
	}

	@Override
	public LinkItem getPos() {
		// TODO Auto-generated method stub
		return this;
	}

}
