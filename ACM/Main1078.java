import java.util.Scanner;
public class Main1078{
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		for(int i =1;;i++){
			int g = 0;
			int n = input.nextInt();
			int m = input.nextInt();
			if(n == 0 && m == 0)break;
			for(int a = 1; a < n;a++){
				for(int b = a+1; b < n;b ++){
					if((a*a+b*b+m)%(a*b) == 0){
						g++;
					}
				}
			}
			System.out.println("case "+i+": "+g);
		}
	}
}