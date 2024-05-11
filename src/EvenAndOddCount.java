import java.util.Scanner;

public class EvenAndOddCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        int evenCount = 0;
        int oddCount = 0;

     /*   while (num>0){
            int res = num%10;
            if (res%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
            num = num/10;
        }  */

        String str = String.valueOf(num);
        for (int i=0; i<str.length();i++){
            int res = str.charAt(i);
            if (res%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }

        System.out.println("Even number count: "+evenCount);
        System.out.println("Odd number count: "+oddCount);

    }
}
