import java.util.Scanner;
public class greaterOfTwoValues {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine().toLowerCase();
		
		switch (input) {
		case "int":
			int a = Integer.parseInt(scanner.nextLine());
			int b = Integer.parseInt(scanner.nextLine());
			
			System.out.println(getMax(a, b));
			break;
		case "char":
			char a1 = scanner.nextLine().charAt(0);
			char b1 = scanner.nextLine().charAt(0);
			
			System.out.println(getMax(a1, b1));
			break;
		case "string":
			String a2 = scanner.nextLine();
			String b2 = scanner.nextLine();
			
			System.out.println(getMax(a2, b2));
			break;
		}
		
	}
	
	static int getMax(int a, int b) {
		if (a > b){
			return a;
		}
		return b;
	}
	
	static char getMax(char a, char b) {
		if (a > b) {
			return a;
		}
		return b;
	}
	
	static String getMax(String a, String b) {
		
		if (a.compareTo(b) >= 0) {
			return a; 
		}
		return b;
	}

}
