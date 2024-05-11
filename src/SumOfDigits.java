import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int sum = 0;

        String strNum = String.valueOf(num);
        int len = strNum.length();
        for (int i=0;  i<len; i++){
            int a = Integer.parseInt(String.valueOf(strNum.charAt(i)));
            sum=sum+a;
        }
        System.out.println(sum);
        //System.out.println();



  /*        while (num>0)//1234
            {
            sum = sum + num%10; // 4+3+2+1
            num = num/10; // 123 12 1
        }
        System.out.println("sum of given number is: "+sum);    */

    }
}
