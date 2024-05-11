import java.util.Arrays;

public class MaxandMinInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,5,80,30,50,60};

        // predefined methods
        Arrays.sort(arr);
        System.out.println("max num in array: "+arr[arr.length-1]);
        System.out.println("max num in array: "+arr[0]);

        // using loops

        int max = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("max num in array: "+max);

        int min = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max num in array: "+min);






    }
}
