import java.util.Random;
import java.util.Scanner;

public class GenerateRondomNumAndString {
    public static void main(String[] args) {

        Random random = new Random();
      /*  int random_num = random.nextInt(100); //  1 to 99
        System.out.println(random_num);

        double double_num = random.nextDouble();
        System.out.println(double_num); // 0.0 to 1.0 by default   */

       // approach 2
        System.out.println(Math.random());

/*        https://commons.apache.org/
             """"generate Strings """"
        String rand_str = RandomStringUtils.ALphabetic(5);
        System.out.println(rand_str);   */

        //System.out.println();
    }
}
