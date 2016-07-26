package codingBat.warmup1;

/**
 * Created by gaston on 25/07/16.
 */

/**
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see
 */
public class Or35 {
    public static void main(String[] args) {
        System.out.println(or35(3));
        System.out.println(or35(10));
        System.out.println(or35(8));
    }

    public static boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }
}
