package codingBat.warmup2;

/**
 * Created by gaston on 25/07/16.
 */
public class StringTimes {
    public static void main(String args[]){
        System.out.println(stringTimes("Hi",2));
        System.out.println(stringTimes("Hi",3));
        System.out.println(stringTimes("Hi",1));
        System.out.println(stringTimes("Hi",0));
    }

    public static String stringTimes(String str, int n) {
        String newStr = "";
        for(int i = 0; i < n ; i++){
            newStr+= str;
        }
        return newStr;
    }
}
