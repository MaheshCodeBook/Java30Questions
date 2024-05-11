import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        String Str = sc.nextLine();
        Str = Str.toLowerCase();
        String revStr = "";
        for (int i=0; i<Str.length(); i++){
            revStr = Str.charAt(i)+revStr;
        }
        if (revStr.equals(Str)){
            System.out.println("palindrome Number");
        }else {
            System.out.println("Not a palindrome number");
        }
    }
}
