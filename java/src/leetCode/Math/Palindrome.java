package leetCode.Math;

/**
 * Created by gaston on 7/27/16.
 *
 * Determine whether an integer is a palindrome. Do this without extra space.
 */
public class Palindrome {

    public static void main(String []args){
        System.out.println(isPalindrome("abccba")); //false
        System.out.println(isPalindrome("abccbx")); // true
        System.out.println(isPalindrome("abccfg")); // true

    }


    public static boolean isPalindrome(String x) {
        char[] evaluate = String.valueOf(x).toCharArray();
        int caracterPermitido = 1;
        for(int i = 0; i < evaluate.length/2;i++){
            if(evaluate[i] != evaluate[evaluate.length-1-i]){
                if(caracterPermitido == 0){
                    return false;
                }else{
                    caracterPermitido--;
                }
            }
        }
        return true;
    }
}
