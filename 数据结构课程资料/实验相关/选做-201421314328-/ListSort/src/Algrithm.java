
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
	/*
	 *       int out, in, min;

      for(out=0; out<nElems-1; out++)   // outer loop
         {
         min = out;                     // minimum
         for(in=out+1; in<nElems; in++) // inner loop
            if(a[in] < a[min] )         // if min greater,
                min = in;               // we have a new min
         swap(out, min);                // swap them

	 */
	public void  selectionSort(Sortable ds){
		Item in,out,min;
		out = ds.getFirst();
		for(;!out.equals(ds.getLast());out = ds.getNextOf(out)){
			min = out;
			for(in = out; !in.equals(ds.getLast());){
				in = ds.getNextOf(in);
				if(ds.compare(in,min)==-1){
					//ds.copy(in,min);
					min = in;
				}
			}
			ds.swap(out,min);
		}
	}
	
	/*int in, out;

	      for(out=1; out<nElems; out++)     // out is dividing line
	         {
	         long temp = a[out];            // remove marked item
	         in = out;                      // start shifts at out
	         while(in>0 && a[in-1] >= temp) // until one is smaller,
	            {
	            a[in] = a[in-1];            // shift item to right
	            --in;                       // go left one position
	            }
	         a[in] = temp;                  // insert marked item*/
	public void  insertionSort(Sortable ds){
		Item in,out;
		out = ds.getFirst();//获取下标为1的
		while(!out.equals(ds.getLast())){
			out = ds.getNextOf(out);
			Item temp = out;
			in = out;
			while(!in.equals(ds.getFirst()) && ds.compare(ds.getPrevOf(in),temp)!=-1){
				ds.swap(in,ds.getPrevOf(in));
				in = ds.getPrevOf(in);
			}
			in = temp;
		}
		
	}
	
	public static void main(String[]args){
		Algrithm a = new Algrithm();
		Array arr = new Array(20);
		long[] dd ={10,2,6,50,90,100,88,1,23,23,4};
		for(long d : dd){
			arr.insert(d);
		}
		a.selectionSort(arr);
		arr.display();
		////////////////
		DLinkList d = new DLinkList();
		d.insert(2);
	}
}
