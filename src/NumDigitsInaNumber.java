import java.util.Scanner;

public class NumDigitsInaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt(); //1234   res = 4
        int numCount = 0;

        while (num>0){ //1234 123 12 1
            num = num/10; // 123 12 1
            numCount++;  // 1
        }
        System.out.println("Number if digits in a given numver:"+numCount);
        //System.out.println();
    }
}
