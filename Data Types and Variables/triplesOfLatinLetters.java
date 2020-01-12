import java.util.Scanner;
public class triplesOfLatinLetters {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		
		for (int i = 0; i < n; i++) {
			char a = (char) (97 + i);
			for (int j = 0; j < n; j++) {
				char b = (char) (97 + j);
				for (int k = 0; k < n; k++) {
					char c = (char) (97 + k);
					String sumCh = "" + a + b + c;
					System.out.println(sumCh);
				}
			}
		}
	}

}
