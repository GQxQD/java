
public class Array implements Sortable<Integer,Long>{
	Long[] data;
	int nElems = 0;
	
	public Array(int size){
		data = new Long[size];
		nElems = 0;
	}
	
	public void insert(long d){
		data[nElems++]= d;
	}
	
	
	public Long getElem(Item<Integer> item) {
		return data[item.getPos()];
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
		data[destItem.getPos()] = data[srcItem.getPos()];
	}

	public void swap(Item<Integer> srcItem, Item<Integer> destItem) {
		long temp = data[destItem.getPos()];
		data[destItem.getPos()] = data[srcItem.getPos()];
		data[srcItem.getPos()] = temp;
	}

	public Item<Integer> getFirst() {
		return new ArrayItem(data[0],0);
	}

	public Item<Integer> getLast() {
		return new ArrayItem(data[nElems-1],nElems-1);
	}

	@Override
	public Item<Integer> getNextOf(Item<Integer> it) {
		// TODO Auto-generated method stub
		int idx = it.getPos()+1;
		return getItem(idx);
	}

	private Item<Integer> getItem(int idx) {
		return new ArrayItem(data[idx],idx);
	}

	@Override
	public Item<Integer> getPrevOf(Item<Integer> it) {
		int idx = it.getPos()-1;
		return getItem(idx);
	}

	@Override
	 public void display()             // displays array contents
    {
    for(int j=0; j<nElems; j++)       // for each element,
       System.out.print(data[j] + " ");  // display it
    System.out.println("");
    }
}
