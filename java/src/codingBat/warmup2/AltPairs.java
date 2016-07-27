package codingBat.warmup2;

/**
 * Created by gaston on 25/07/16.
 * Given a leetCode.string, return a leetCode.string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 */
public class AltPairs {

    public static void main(String args[]){
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
        System.out.println(altPairs(""));
        System.out.println(altPairs("ga"));
        System.out.println(altPairs("g"));
        System.out.println(altPairs(null));
    }

    public static String altPairs(String str) {
        if(str == null || str.length() < 2){
            return str;
        }
        char[] aStr =  str.toCharArray();
        StringBuilder newStr = new StringBuilder();
        for(int i =0; i < aStr.length ;i +=4){
            newStr.append(aStr[i]);
            if(i +1 <aStr.length ){
                newStr.append(aStr[i+1]);
            }

        }
        return newStr.toString();
    }

}
