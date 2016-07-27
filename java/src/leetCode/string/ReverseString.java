package leetCode.string;

/**
 * Created by gaston on 7/27/16.
 *
 * Write a function that takes a string as input and returns the string reversed.
 */
public class ReverseString {
    public static void main(String []args){
        System.out.println(reverseString("hello")); //olleh
        System.out.println(reverseString("h")); //h
        System.out.println(reverseString("")); //h
        System.out.println(reverseString(null)); //h

    }

    public static String reverseString(String s) {
        if(s == null) return null;
        char[] rs = new char[s.length()];
        for(int i = s.length()-1,j=0;i >= 0;i--,j++){
            rs[j] = s.charAt(i);
        }
        return new String(rs);
    }
}
