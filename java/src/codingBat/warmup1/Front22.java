package codingBat.warmup1;

/**
 * Created by gaston on 25/07/16.
 */
public class Front22 {
    public Front22() {
        System.out.println(front22("kitten"));
        System.out.println(front22("Ha"));
        System.out.println(front22("abc"));
        System.out.println(front22(""));
        System.out.println(front22("g"));
        System.out.println(front22(null));
    }
    public String front22(String str){
        if(str == null || "".equals(str)){
            return str;
        }

        if(str.length() < 2){
            StringBuffer buf = new StringBuffer();
            buf.append(str.charAt(0)).append(str.charAt(0)).append(str.charAt(0));
            return buf.toString();
        }

        return str.substring(0,2) + str + str.substring(0,2);
    }
}
