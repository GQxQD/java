////////////////////////////////////////////////////////////////
import java.util.Date;
import java.text.SimpleDateFormat;
class BubbleSortApp{
    public static void main(String[] args){
        int maxSize = 100000;            // array size
        ArrayBub arr;                 // reference to array
        arr = new ArrayBub(maxSize);  // create the array

 		/*arr.insert(77);
		arr.insert(99);
		arr.insert(44);
		arr.insert(55);
		arr.insert(22);
		arr.insert(88);
		arr.insert(11);
		arr.insert(00);
		arr.insert(66);
		arr.insert(33);*/
      
		for(int j=0; j<maxSize; j++){ // random numbers
		    long n = (long)( java.lang.Math.random()*(maxSize-1) );
		    arr.insert(n);
		  } 

        System.out.println("before sorted");
        //arr.display();                // display items
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");//设置日期格式
        Date before = new Date();
        System.out.println(df.format(before));// new Date()为获取当前系统时间 

        System.out.println("Sorting...");// new Date()为获取当前系统时间 
        arr.bubbleSort();             // bubble sort them
    
        System.out.println("after sorted");
        Date after = new Date();    
        System.out.println(df.format(after));    
        long interval=after.getTime()-before.getTime();// 计算时间间隔，毫秒单位

        System.out.println(interval);
        //arr.display();                // display them again
    }  // end main()
}  // end class BubbleSortApp
////////////////////////////////////////////////////////////////
