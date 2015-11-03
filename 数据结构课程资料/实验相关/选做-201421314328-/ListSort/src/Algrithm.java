
public class Algrithm {
	/**
	 *  int out, in;

      for(out=nElems-1; out>1; out--)   // outer loop (backward)
         for(in=0; in<out; in++)        // inner loop (forward)
            if( a[in] > a[in+1] )       // out of order?
               swap(in, in+1);          // swap them
      }  // end bubbleSort()
	 * @param ds
	 */
	public void  bubbleSort(Sortable ds){		
	      Item out = ds.getLast();
	      Item in = ds.getFirst();
	      Item item1 = ds.getNextOf(in);
	      for(; !out.equals(item1); out = ds.getPrevOf(out))   // outer loop (backward)
	         for(in=ds.getFirst(); !out.equals(in); in = ds.getNextOf(in))        // inner loop (forward)
	            if( ds.compare(in, ds.getNextOf(in))>0 )       // out of order?
	               ds.swap(in, ds.getNextOf(in));          // swap them
	     
	}
	
	public void  selectionSort(Sortable ds){
		//...
		
	}
	
	public void  insertionSort(Sortable ds){
		//...
		
	}
	
	public static void main(String[]args){
		Algrithm a = new Algrithm();
		Array arr = new Array(10);
		long[] dd ={10,2,6,50,90,100,88};
		for(long d : dd){
			arr.insert(d);
		}
		a.bubbleSort(arr);
		arr.display();
	}
}
