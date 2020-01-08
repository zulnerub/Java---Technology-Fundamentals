package Exercise_01;
import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String num = scanner.nextLine();
		
		int factorial = 1;
		int sum = 0;
		int actual = Integer.parseInt(num);
		
		for (int i = 0;i < num.length();i++) {
			char ch = num.charAt(i);
			String cha = "" + ch;
			for (int j = Integer.parseInt(cha);j > 0;j--) {
				factorial *= j;
			}
			sum += factorial;
			factorial = 1;
		}
		
		if (actual == sum) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}

}
