import java.util.Scanner;
public class Main1075{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		for(int i = 0; i < T; i ++){
			int N = input.nextInt();
			int sum = 0;
			for(int j = 0; j < N; j++){
				sum += N;
				if(sum >= 10000)
					sum %= 10000;
			}
			System.out.println(sum);
		}
	}
}