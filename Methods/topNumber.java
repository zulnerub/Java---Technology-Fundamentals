import java.util.Scanner;
public class topNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in)	;
		
		int input = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= input; i++) {
			String a = "" + i;
			int[] arr = new int[a.length()];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt("" + a.charAt(j));
			}
			
			boolean odd = false;
			for (int k = 0; k < arr.length; k++) {
				if (arr[k] % 2 != 0) {
					odd = true;
				}
			}
			
			int sum = 0;
			for (int l = 0; l < arr.length; l++) {
				sum += arr[l];
			}
			
			if (sum % 8 == 0 && odd == true) {
				System.out.println(i);
			}
		}
	}

}
