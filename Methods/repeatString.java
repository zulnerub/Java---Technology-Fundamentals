import java.util.Scanner;
public class repeatString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String text = scanner.nextLine();
		int count = Integer.parseInt(scanner.nextLine());
		
		System.out.println(repeatStr(text,count));
		}
	
		static String repeatStr(String text, int count) {
			String result = "";
			for (int i = 0; i < count; i++) {
				result += text;
			}
			return result;
		}
}

		
		
