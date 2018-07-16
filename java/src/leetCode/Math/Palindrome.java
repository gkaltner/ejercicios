package leetCode.Math;

/**
 * Created by gaston on 7/27/16.
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Palindrome {

    public static void main(String []args){
        System.out.println(isPalindrome("abccba")); //true
        System.out.println(isPalindrome("abccbx")); //true
        System.out.println(isPalindrome("abccfg")); //false

    }


    public static boolean isPalindrome(String x) {
        char[] evaluate = String.valueOf(x).toCharArray();
        for(int i = 0; i < evaluate.length/2;i++){
            if(evaluate[i] != evaluate[evaluate.length-1-i]){
                return false;
            }
        }
        return true;
    }
}
