public class RemoveSpecialChar {
    public static void main(String[] args) {
        String str = "mahesh#!@ latin string";

        String str2 = "@#maven &*( tool";
        str = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(str);

        String ac = "mahesh babu swathi";
        ac = ac.replace("babu","Mokshith");
        System.out.println(ac);
        //System.out.println();
    }
}
