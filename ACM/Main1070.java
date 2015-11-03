import java.util.Scanner;
public class Main1070{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		int c = input.nextInt();
		for(int i = 0; i < c; i ++){
			int n = input.nextInt();
			int[] arr = new int[n];
			for(int j = 0; j < n; j ++){
				arr[j] = input.nextInt();
			}
			java.util.Arrays.sort(arr);
			int min = arr[0];
			for(int t : arr){
				if(t > min){
					min = t;
					break;
				}
			}
			if(min == arr[0])
				System.out.println("NO");
			else
				System.out.println(min);
		}
	}
}