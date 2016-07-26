package string;

/**
 * Created by Gaston Kaltner on 29/07/15.
 * e-mail: gaston.kaltner@gmail.com
 */
public class CompareVersionNumbers {
    public static void main(String[] args){
        System.out.print(compareVersion("1.0.1","1.0.1"));
    }

    public static int compareVersion(String version1, String version2) {
        String[] ver1 = version1.split("\\.");
        String[] ver2 = version2.split("\\.");

        int value = 0;
        int i = 0;
        for(; i < ver1.length && i < ver2.length ; i++){
            value = Integer.parseInt(ver1[i]) - Integer.parseInt(ver2[i]);
            if(value != 0) {
                return value > 0 ? 1 : value < 0 ? -1 : 0;
            }
        }

        for(; i < ver1.length ; i++) {
            value = Integer.parseInt(ver1[i]);
        }

        for(; i < ver2.length ; i++) {
            value = -Integer.parseInt(ver2[i]);
        }

        return value > 0 ? 1 : value < 0 ? -1 :0;
    }
}
