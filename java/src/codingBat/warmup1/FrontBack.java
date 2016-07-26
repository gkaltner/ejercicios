package codingBat.warmup1;

/**
 * Created by gaston on 22/07/16.
 */
public class FrontBack {
    public FrontBack(){
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
        System.out.println(frontBack(""));
        System.out.println(frontBack(null));
    }

    public String frontBack(String str) {
        if(str == null || str.length() < 1){
            return str;
        }
        char[] chars = str.toCharArray();
        char aux = chars[chars.length -1];
        chars[chars.length -1] =chars[0];
        chars[0] = aux;
        return new String(chars);
    }
}
