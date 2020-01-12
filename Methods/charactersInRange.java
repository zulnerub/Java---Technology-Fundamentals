import java.util.Scanner;
public class carsInRange {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        String c = scanner.nextLine();
        String d = scanner.nextLine();




        System.out.println(printChars(c, d));
    }

    static String printChars(String c, String d){
        char a;
        char b;

        if (c.charAt(0) < d.charAt(0)){
            a = c.charAt(0);
            b = d.charAt(0);
        } else {
            b = c.charAt(0);
            a = d.charAt(0);
        }


        String result = "";
        for (int i =  ++a; i < b; i++){
            char temp = (char) i;
            result = result + temp + " ";
        }
        return result;
    }

}
