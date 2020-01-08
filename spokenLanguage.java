import java.util.Scanner;
public class lekcia3 {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			String state = scanner.nextLine();
			
			switch (state) {
			case "England":
			case "USA":
				System.out.print("English");
				break;
			case "Spain":
			case "Argentina":
			case "Mexico":
				System.out.println("Spanish");
				break;
				default:
					System.out.print("unknown");
			}
		}

}
