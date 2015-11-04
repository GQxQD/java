import java.util.Scanner;
public class Main1058{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		while(true){
			int n = input.nextInt();
			if(n == 0)break;
			int [] list = new int [n];
			for(int i = 0; i < n; i ++){
				list [i] = input.nextInt();
			}
			java.util.Arrays.sort(list);
			for(int i = 0; i < n; i++){
				if(i == n-1){
					System.out.println(list[i]);
					break;
				}else if(list[i] == list[i+1]){
					i++;
				}else{
					System.out.println(list[i]);
					break;
				}
			}
		}
	}
}