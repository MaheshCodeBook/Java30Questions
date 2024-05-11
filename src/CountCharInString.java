public class CountCharInString {
    public static void main(String[] args) {
        String str = " java is programming language";
        int len = str.length();

        /*int after_a_removal_count = str.replace("a","").length();
        int count_of_a = len - after_a_removal_count;
        System.out.println("number of occurences \"a\" is:"+count_of_a);*/

        int lenOfString = str.replaceAll("\\s","").length();
        System.out.println(lenOfString);
       //System.out.println();




    }
}
