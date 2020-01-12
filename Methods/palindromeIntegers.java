import java.util.Scanner;
public class palidromeIntegers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		
		while (!input.equals("END")) {
			System.out.println(isPali(input));
			input = sc.nextLine();
		}
	}
	
	static boolean isPali(String input) {
		boolean isPalidrome = true;
		char[] a = input.toCharArray();
			for (int i = 0; i < a.length / 2; i++ ) {
				if ( a[i] != a[a.length - 1 - i]) {
					isPalidrome = false;
					continue;
				}
			}
			return isPalidrome;
	}

}
