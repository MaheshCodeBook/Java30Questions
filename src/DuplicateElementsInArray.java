import java.util.HashSet;

public class DuplicateElementsInArray {
    public static void main(String[] args) {
        String[] strArray = {"java","c","c","c++","python","java"};

        HashSet<String> hset = new HashSet<>();

        for (String element : strArray){
            hset.add(element);
        }
        System.out.println(hset);
        //System.out.println();



    }
}
