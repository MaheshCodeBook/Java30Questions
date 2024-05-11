import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();
        int n = str.length();

        /*StringBuffer sb = new StringBuffer(str);
        StringBuffer rev = sb.reverse();
        System.out.println(rev);*/

        String revStr = "";
        for (int i=0; i<str.length();i++){
            revStr = str.charAt(i) + revStr;
        }
        System.out.println(revStr);



    }


}
