import javax.lang.model.type.NullType;
import java.util.Scanner;
public class passwordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        String a = lenght(input);
        String b = lettersAndDiggits(input);
        String c = twoDigits(input);

        if (a.length() > 0){
            System.out.println(lenght(input));
        }

        if (b.length() > 0){
            System.out.println(lettersAndDiggits(input));
        }

        if (c.length() > 0){
            System.out.println(twoDigits(input));
        }

        if ( a.isEmpty() && b.isEmpty() && c.isEmpty()){
            System.out.println("Password is valid");
        }
    }

    static String lenght (String input){
        String errLenght = "";
        if(input.length() < 6 || input.length() > 10){
            errLenght = "Password must be between 6 and 10 characters";

        }
        return errLenght;
    }

    static String lettersAndDiggits (String input){
        String errLetAndDigs = "";
        for (int i = 0; i < input.length(); i++){
            char temp = input.charAt(i);
            if (!Character.isLetterOrDigit(temp)){
                errLetAndDigs = "Password must consist only of letters and digits";

            }
        }
        return errLetAndDigs;
    }

    static String twoDigits (String input){
        String errTwoDigits = "";
        int counterDigit = 0;
        for (int i = 0; i < input.length(); i++){
            char temp = input.charAt(i);
            if (Character.isDigit(temp)){
                counterDigit++;
            }
        }

        if (counterDigit < 2){
            errTwoDigits = "Password must have at least 2 digits";

        }
        return errTwoDigits;
    }



}
