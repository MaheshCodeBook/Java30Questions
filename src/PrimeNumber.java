import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int primeCount = 0;
        for (int i=1; i<=n; i++){
            if (n%i==0){
                primeCount++;
            }
        }
        if (primeCount<=2){
            System.out.println("Prime Number");
        }else {
            System.out.println("Not a prime Number");
        }
    }
}