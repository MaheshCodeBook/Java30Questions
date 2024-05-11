import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class SortingElementsInArrayInbuidmethods {
    public static void main(String[] args) {
        int[] arr = {10,25,20,1,36,78,54,69};
        Arrays.sort(arr);
        System.out.println("After sorting array is: "+Arrays.toString(arr));

        Integer arr2[] = {10,25,20,1,36,78,54,69};

        Arrays.sort(arr2, Collections.reverseOrder());
        System.out.println("After sorting array is: "+Arrays.toString(arr2));

        //Collection.reverse(Arrays.asList(arr2));
        //System.out.println();
    }

}
