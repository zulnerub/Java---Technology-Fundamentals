import java.math.BigInteger;
import java.util.Scanner;

public class bigIntegerSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BigInteger firstNum = new BigInteger(sc.nextLine());
		BigInteger secondNum = new BigInteger(sc.nextLine());
		
		BigInteger sum = firstNum.add(secondNum);
		System.out.println(sum);
		
		
	}

}
