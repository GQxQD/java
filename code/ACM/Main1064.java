import java.util.Scanner;
public class Main1064{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		//1  2  3  4  5  6  7  8  9
		//1  2  3  4  
		//1x 1x1j 2x1j 3x2j 5x3j 8x5j
		int T = input.nextInt();
		for(int i = 0; i < T; i++){
			int N = input.nextInt();
			int n = 1,o = 0,temp;
			for(int j = 1; j < N;j++){
				temp = o;
				o = n;
				n = temp+n;
			}
			System.out.println(o+n);
		}
	}
}