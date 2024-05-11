public class SumOfElementsInArray {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25,30};
        int sum = 0;

     /*   for (int i=0; i<arr.length;i++){
            sum = sum+arr[i];
        } */

     for (int element : arr){
         sum = sum+element;
     }
        System.out.println(sum);


    }
}
