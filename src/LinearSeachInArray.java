import java.util.Arrays;

public class LinearSeachInArray {
    public static void main(String[] args) {
        int[] arr = {10,20,50,80,100,150};

        int search_ele = 90;
        boolean result = false;
        for (int i=0; i<arr.length;i++){
          //  System.out.println(arr[i]);
            if(search_ele == arr[i]){
                System.out.println("Element found at "+i+" Index");
                result = true;
                break;
            }
        }

        if(result== false){
            System.out.println("Element not found");
        }


        // binary appoach
        int indx= Arrays.binarySearch(arr,50);
        System.out.println("Element found at "+indx+" Index");
        //System.out.println();
    }
}
