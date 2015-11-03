
public class ArrayItem implements Item<Integer>{
	long data;
	int index;
	ArrayItem(long data, int idx){
		this.data = data;
		this.index = idx;
	}
	public long getData() {
		// TODO Auto-generated method stub
		return data;
	}

	public Integer getPos() {
		// TODO Auto-generated method stub
		return index;
	}
	
	@Override
	public boolean equals(Object obj) {
		ArrayItem o = (ArrayItem) obj;
		return this.index == o.index;
	}
	
	

}
