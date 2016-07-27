package leetCode.Math;

/**
 * Created by gaston on 7/27/16.
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Palindrome {

    public static void main(String []args){
        System.out.println(isPalindrome(123123)); //false
        System.out.println(isPalindrome(323)); // true
        System.out.println(isPalindrome(33)); // true
        System.out.println(isPalindrome(3)); // true
        System.out.println(isPalindrome(22522)); // true
        System.out.println(isPalindrome(-22522)); // false
        System.out.println(isPalindrome(225522)); // true
        System.out.println(isPalindrome(-2147447412)); //false
    }


    public static boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        char[] evaluate = String.valueOf(x).toCharArray();

        for(int i = 0; i < evaluate.length/2;i++){
            if(evaluate[i] != evaluate[evaluate.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
