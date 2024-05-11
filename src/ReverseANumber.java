import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt(); //1234

       /* StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();
        System.out.println(rev); */


       String newStr = "";
       String strNum = String.valueOf(num);
       for (int i=0; i<strNum.length(); i++){
           newStr = strNum.charAt(i)+newStr;
       }
        System.out.println(newStr);

    }
}
