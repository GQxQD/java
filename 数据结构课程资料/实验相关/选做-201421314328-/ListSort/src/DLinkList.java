
public class DLinkList implements Sortable<Integer, Long>{
	private Item<Object> first;
	private Item<Object> last;
	public DLinkList(){
		
	}

	public Long getElem(Item<Integer> item) {
		return item.getData();
	}

	public int compare(Item<Integer> item1, Item<Integer> item2) {
		if(getElem(item1)==getElem(item2)){
			return 0;
		}else if(getElem(item1)<getElem(item2)){
			return -1;
		}
		return 1;
	}

	public void copy(Item<Integer> srcItem, Item<Integer> destItem) {
		//data[destItem.getPos()] = data[srcItem.getPos()];
	}

	@Override
	public void swap(Item<Integer> srcItem, Item<Integer> destItem) {
//		long temp = data[destItem.getPos()];
//		data[destItem.getPos()] = data[srcItem.getPos()];
//		data[srcItem.getPos()] = temp;
	}

	@Override
	public Item<Integer> getFirst() {
		// TODO Auto-generated method stub
		return first;
	}

	@Override
	public Item<Integer> getLast() {
		// TODO Auto-generated method stub
		return last;
	}

	@Override
	public Item<Integer> getNextOf(Item<Integer> it) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Item<Integer> getPrevOf(Item<Integer> out) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		
	}
}
