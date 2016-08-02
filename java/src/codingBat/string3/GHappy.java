package codingBat.string3;

/**
 * Created by gaston on 01/08/16.
 *
 * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
 * Return true if all the g's in the given string are happy.
 */
public class GHappy {
    public static void main(String []args){
        System.out.println(gHappy("xxggxx")); // true
        System.out.println(gHappy("xxgxx")); // false
        System.out.println(gHappy("xxggyygxx")); // false
        System.out.println(gHappy(""));// true
        System.out.println(gHappy("xxgggxyz")); // true
        System.out.println(gHappy("xxgggxyg")); // false
        System.out.println(gHappy("xxgggxygg")); // true
        System.out.println(gHappy("yyygggxyy")); // true
        System.out.println(gHappy("g")); // false
    }

    private static boolean gHappy(String str) {
        int j = 0;
        for(int i = str.indexOf('g');i >= 0 && i < str.length(); i++){
            if(str.charAt(i) ==  'g'){
                j = 1;
                i++;
                for(; i < str.length() && str.charAt(i) ==  'g'; i++,j++);
                if(j < 2){
                    return false;
                }
            }
        }
        return true;
    }
}
