package codingBat.string2;

/**
 * Created by gaston on 01/08/16.
 */
public class BobThere {

    public static void main(String []args){
        System.out.println(bobThere("abcbob"));//true
        System.out.println(bobThere("b9b"));//true
        System.out.println(bobThere("bac"));//false
    }

    public static boolean bobThere(String str) {
        return str != null && str.matches(".*b.b.*");
    }
}
