package leetCode.Math;

/**
 * Created by gaston on 7/28/16.
 */
public class Prime {
    public static void main(String []args){
        System.out.println(isPrime(2)); //true
        System.out.println(isPrime(3)); //true
        System.out.println(isPrime(4)); //false
        System.out.println(isPrime(5)); //true
        System.out.println(isPrime(6)); //false
        System.out.println(isPrime(7)); //true
        System.out.println(isPrime(8)); //false
        System.out.println(isPrime(9)); //false
        System.out.println(isPrime(11)); //true
        System.out.println(isPrime(17)); //true
        System.out.println(isPrime(457)); //true
    }

    public static boolean isPrime(int prime){
        if(prime > 2 && prime % 2 == 0){
            return false;
        }
        for(int i = 3;i*i <= prime; i+=2 ){
            if(prime % i == 0){
                return false;
            }
        }
        return true;
    }
}
