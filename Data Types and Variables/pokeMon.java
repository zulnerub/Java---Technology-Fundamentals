import java.util.Scanner;
public class pokeMon {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int m = Integer.parseInt(scanner.nextLine());
		int y = Integer.parseInt(scanner.nextLine());
		int control = n;
		int count = 0;
		
		while (n >= m) {
			
			if (n == control / 2 && control % 2 == 0 && y != 0) {
				n /= y;
				if ( n >= m) {
					n -= m;
					count++;
				}
				
			}else {
				n -= m;
				count++;
			}
		}
		System.out.println(n);
		System.out.println(count);
	}

}
