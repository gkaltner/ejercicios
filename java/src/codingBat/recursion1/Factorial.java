package codingBat.recursion1;

/**
 * Created by gaston on 25/07/16.
 */
public class Factorial {

    public static void main(String args[]){
        System.out.println(factorial(1)); //1
        System.out.println(factorial(2)); //2
        System.out.println(factorial(3)); //6
        System.out.println(factorial(4)); //24
        System.out.println(factorial(5)); //120
        System.out.println(factorial(6)); //720

    }

    public static int factorial(int n) {
        if(n < 2){
            return 1;
        }
        return factorial(n-1) * n;
    }
}
