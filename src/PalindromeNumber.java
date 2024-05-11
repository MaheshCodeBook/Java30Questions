import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        String newStr = "";
        String strNum = String.valueOf(num);
        for (int i=0; i<strNum.length(); i++){
            newStr = strNum.charAt(i)+newStr;
        }
        if (strNum.equals(newStr)){
            System.out.println("palindrome Number");
        }else {
            System.out.println("Not a pakindrome number");
        }
        //System.out.println();
    }
}
