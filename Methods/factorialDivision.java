import java.util.Scanner;
public class FactorialDivision {
	
	    public static void main(String[] args) {
	    	
	        Scanner sc = new Scanner(System.in);

	        int a = Integer.parseInt(sc.nextLine());
	        int b = Integer.parseInt(sc.nextLine());

	        long factA = 1;
	        long factB = 1;
	        
	        if (a == 0){
	            factA = 1;
	        }else if(a > 0){
	            for (int i = 1; i <= a; i++){
	                factA *= i;
	            }
	        }
	        
	        if (b == 0){
	            factB = 1;
	        }else if (b > 0){
	            for (int j = 1; j <= b; j++){
	                factB *= j;
	            }
	        }
	        
	        

	        double numA = (double) factA;
	        double numB = (double) factB;
	        if (a >= 0 && b >= 0) {
	        	System.out.printf("%.2f", divFact(factA, factB));
	        }
	        
	    }

	    static double divFact(double numA, double numB){

	        return numA / numB;
	    }
}

