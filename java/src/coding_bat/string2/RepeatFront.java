package coding_bat.string2;

/**
 * Created by gaston on 01/08/16.
 * Given a string and an int n, return a string made of the first n characters of the string,
 * followed by the first n-1 characters of the string, and so on.
 * You may assume that n is between 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
 */
public class RepeatFront {

    public static void main(String []args){
        System.out.println(repeatFront("Chocolate", 4));//ChocChoChC
        System.out.println(repeatFront("Chocolate", 3));//ChoChC
        System.out.println(repeatFront("Ice Cream", 2));//IcI
    }

    public static  String repeatFront(String str, int n) {
        StringBuilder bStr = new StringBuilder();
        for(int i = n; i >=0;i--){
            bStr.append(str.substring(0,i));
        }
        return bStr.toString();
    }
}


