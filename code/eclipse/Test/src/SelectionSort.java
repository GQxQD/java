
public class SelectionSort {
	public static void main(String[] args) {
		int[] list = {-1,45,656,1,0,-5646,31,0,1000000000,9,1,4,2,3,0,5,6,7,8,12,2343,46,34,2131,345,1,2,3,4,21};
		int min, index;
		for(int j = 0; j < list.length-1; j ++){
			min = list[j];
			index = j;
			for(int i = j+1; i < list.length; i ++){
				if(list[i] < min){
					min = list[i];
					index = i;
				}
			}
			list[index] = list[j];
			list[j] = min;
		}
		for(int i:list){
			System.out.print(i+" ");
		}
	}

}
