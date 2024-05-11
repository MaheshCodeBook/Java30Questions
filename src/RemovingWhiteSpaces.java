import java.util.Scanner;

public class RemovingWhiteSpaces {
    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter the String: ");
        String str = "  Mahesh mahesh   mahesh    ";

       // str = str.replaceAll("[a-z]","");
        str = str.replaceAll("\\s","");
        System.out.println(str);

    }
}
