import java.util.Scanner;
public class messeges_05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int times = Integer.parseInt(scanner.nextLine());
		int offset;
		String message = "";
		char toType;
		
		for (int i = 0; i < times;i++) {
			String input = scanner.nextLine();
			int lenght = input.length();
			String main = "" + input.charAt(0);
			if (main.equals("0")) {
				toType = ' ';
			}else {
				if ((!main.equals("8") && !main.equals("9"))) {
					offset = (Integer.parseInt(main) - 2) * 3;
				}else{
					offset = ((Integer.parseInt(main) - 2) * 3) + 1;
				}
				int letterIndex = (offset + lenght - 1);
				int letter = 97 + letterIndex;
				toType = (char) letter;	
			}
			message += toType;
			
			
		}
		System.out.println(message);
		
		
	}

}
