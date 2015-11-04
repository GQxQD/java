import java.util.Scanner;
public class Main1054{
	public static boolean checked(String st, int start, int end){
		int l = end - start + 1;
		for(int i = start; i < (l/2 + start); i ++){
			if(st.charAt(i) != st.charAt(end - i + start)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		while(input.hasNext()){
			String txt = input.next();
			int N = txt.length();
			//System.out.println(checked(txt,0,txt.length()-1));
			for(int i = 1; i < txt.length()+1; i ++){
				for(int j = 0; j < txt.length()-i; j ++){
					if(checked(txt,j,j+i)){
						N ++;
					}
				}
			}
			System.out.println(N);
		}
	}
}