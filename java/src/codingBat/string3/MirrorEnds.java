package codingBat.string3;

/**
 * Created by gaston on 01/08/16.
 *
 * Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
 * In other words, zero or more characters at the very begining of the given string, and at the very end
 * of the string in reverse order (possibly overlapping).
 * For example, the string "abXYZba" has the mirror end "ab".
 */
public class MirrorEnds {
    public static void main(String []args){
        System.out.println(mirrorEnds("abXYZba")); // "ab"
        System.out.println(mirrorEnds("abca")); // "a"
        System.out.println(mirrorEnds("aba")); // "aba"
    }

    public static String mirrorEnds(String string) {
        StringBuilder bStr = new StringBuilder();
        boolean consecutive = true;
        for (int i = 0; i < string.length(); i++){
            if(consecutive && string.charAt(i) == string.charAt(string.length() -i -1)){
                bStr.append(string.charAt(i));
            }else{
                consecutive = false;
            }
        }
        return bStr.toString();
    }

}
