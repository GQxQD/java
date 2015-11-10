public class LinkItem implements Item<Link> {
	private Link dData; // data item

	public LinkItem(long dData) {
		this.dData = new Link(dData);
	}

	public long getData() {
		return dData.dData;
	}

	public Link getPos() {
		return this.dData;
	}

	public boolean equals(Object obj) {
		LinkItem o = (LinkItem) obj;
		return this.dData == o.dData;
	}

}
