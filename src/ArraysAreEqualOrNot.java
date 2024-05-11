import java.util.Arrays;

public class ArraysAreEqualOrNot {
    public static void main(String[] args) {
        int[] arr1 = {2,4,6,8,20,15,25};
        int[] arr2 = {2,4,6,8,20,15,25};
        boolean status = Arrays.equals(arr1,arr2);

        if (status==true){
            System.out.println("Arrays are equal");
        }else{
            System.out.println("Arrays are NOT equal");
        }

        //System.out.println();
    }
}
