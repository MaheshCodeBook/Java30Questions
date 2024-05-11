public class swap2nums {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;

    // using addition & substration
      /*  a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);  */

    // using 3rd variable
       /*  int z = a;
        a=b;
        b=z;
        System.out.println("a:"+a);
        System.out.println("b:"+b);   */
        //System.out.println();

       a = a*b;
       b = a/b;
       a = a/b;
       System.out.println("after swaping A  value is:"+a);
       System.out.println("after swaping B value is:"+b);

    }
}
