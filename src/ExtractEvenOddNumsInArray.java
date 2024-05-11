import java.util.Scanner;

public class ExtractEvenOddNumsInArray {
    public static void main(String[] args) {
        int[] arr = {2,5,6,7,8,15,14,10};
        int even_count = 0;
        int odd_count = 0;

        for (int element : arr){
            if (element%2==0){
                even_count++;
            }else {
                odd_count++;
            }
        }
        System.out.println(even_count);
        System.out.println(odd_count);


    }
}
