import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A value: ");
        int a = sc.nextInt();

        System.out.println("Enter B value: ");
        int b = sc.nextInt();

        System.out.println("Enter C value: ");
        int c = sc.nextInt();

     /*   if (a>b && a>c){
            System.out.println("Largest Num is: "+a);
        }else if(b>c && b>a){
            System.out.println("Largest Num is: "+b);
        }else {
            System.out.println("Largest Num is: "+c);
        }   */

        // ternary operator

        int largest1 = a>b ? a:b;
        int largest2 = c>largest1 ? c:largest1;
        System.out.println("Largest Num is: "+largest2);
        //System.out.println();



    }
}
