import java.util.Scanner;
public class balancedParentheses {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int countL = 0;
		int countR = 0;
		
		boolean balance = true;
		
		for (int i = 0; i < n; i++) {
			String input = scanner.nextLine();
			
				if (input.equals("(")) { 
					countL++;
					
				}else if (input.equals(")")) {
					countR++;
				}
				if (countR > countL) {
					balance = false;
				}	
		 }
		
		if (balance == false || countL != countR) {
			System.out.println("UNBALANCED");
		}else {
			System.out.println("BALANCED");
		}
	}
}

