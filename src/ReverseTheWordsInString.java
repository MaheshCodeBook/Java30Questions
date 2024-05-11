import java.util.Scanner;

public class ReverseTheWordsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

       /* String  reverseStr = "";
        for (int i=0; i<str.length();i++){
            reverseStr = str.charAt(i)+reverseStr;

        }
        System.out.println(reverseStr);

        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev = sb.reverse();
        System.out.println(rev);  */

       String[] words = str.split(" ");
       String reverseString = "";
       for (String w : words){
           String reverseWord = "";
           for (int i=w.length()-1; i>=0; i--){
               reverseWord = reverseWord + w.charAt(i);
           }
           reverseString = reverseString + reverseWord+" ";
       }
        System.out.println(reverseString);

    }
}
