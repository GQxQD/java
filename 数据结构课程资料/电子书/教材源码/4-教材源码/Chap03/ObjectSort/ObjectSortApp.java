import java.util.*;
class ObjectSortApp
   {
   public static void main(String[] args)
      {
          
      int[] aa={1212,454,884,656,646,55,66,8989};
  Arrays.sort(aa);
  
  int maxSize = 100;             // array size
      ArrayInOb arr;                 // reference to array
  arr = new ArrayInOb(maxSize);  // create the array

    arr.insert("阿刚", "Patty", 24);
      arr.insert("王刚", "Patty", 24);
      arr.insert("王小刚", "Doc", 59);    
            arr.insert("王大刚", "Doc", 59);
                        arr.insert("王英刚", "Doc", 59);
                                                            arr.insert("三", "Patty", 24);
                                    arr.insert("一", "Patty", 24);
                                    arr.insert("二", "Patty", 24);
      
      arr.insert("Evans", "Patty", 24);
      arr.insert("Smith", "Doc", 59);
      arr.insert("Smith", "Lorraine", 37);
      arr.insert("Smith", "Paul", 37);
      arr.insert("Yee", "Tom", 43);
      arr.insert("Hashimoto", "Sato", 21);
      arr.insert("Stimson", "Henry", 29);
      arr.insert("Velasquez", "Jose", 72);
      arr.insert("Vang", "Minh", 22);
      arr.insert("Creswell", "Lucinda", 18);

      System.out.println("Before sorting:");
      arr.display();                 // display items

      arr.insertionSort();           // insertion-sort them

      System.out.println("After sorting:");
      arr.display();                 // display them again
      }  // end main()
   }  // end class ObjectSortApp
////////////////////////////////////////////////////////////////