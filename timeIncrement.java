import java.util.Scanner;
public class handm {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
			int h = Integer.parseInt(scanner.nextLine());
			int m = Integer.parseInt(scanner.nextLine());
			
			int totaltime = h * 60 + m + 30;
			
			int nh = totaltime / 60;
			int nm = totaltime % 60;
			
			if (nh > 23) {
				nh -= 24;
				System.out.printf("%d:%02d", nh, nm);
			}else {
				System.out.printf("%d:%02d", nh, nm);
			}
		}

}
