import java.util.Scanner;
public class dataTypeFinder {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			String input = scanner.nextLine();
			
			while (!input.equals("END")) {
				
				if (input.length() == 1) {
					char a = input.charAt(0);
					
					if ( a >= 48 && a <= 57 ) {
						System.out.printf("%s is integer type%n", input);
					}else {
						System.out.printf("%s is character type%n", input);
						
					}
					
				}else {
					
					if (input.toLowerCase().equals("true") || input.toLowerCase().equals("false")) {
						System.out.printf("%s is boolean type%n", input);
					}else {
						boolean typeStr = false;
						boolean typeFloat = false;
						
						for (int i = 0; i < input.length(); i++) {
							char b = input.charAt(i);
							
							if ((int) b < 45 || b > 57) {
								typeStr = true;
							}
							
							if (b == 46) {
								typeFloat = true;
							}
						}
						
						if (typeStr) {
							System.out.printf("%s is string type%n", input);
						}else {
							if (typeFloat) {
								System.out.printf("%s is floating point type%n", input);
							}else {
								System.out.printf("%s is integer type%n", input);
							}
						}
					}
				}
				input = scanner.nextLine();
			}
	}
}
