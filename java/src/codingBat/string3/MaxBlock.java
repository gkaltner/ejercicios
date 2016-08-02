package codingBat.string3;

/**
 * Created by gaston on 01/08/16.
 */
public class MaxBlock {
    public static void main(String []args){
        System.out.println(maxBlock("hoopla")); // 2
        System.out.println(maxBlock("abbCCCddBBBxx")); // 3
        System.out.println(maxBlock("")); // 0
        System.out.println(maxBlock("xyz")); // 1
    }

    public static int maxBlock(String str) {
        int max = 0,count = 0;
        if(str.length() <= 0){
            return 0;
        }
        char before = str.charAt(0);
        for(int i = 0; i < str.length(); i++){
            if(before != str.charAt(i)){
                before = str.charAt(i);
                count = 1;
            }else{
                ++count;
                if(max < count){
                    max = count;
                }
            }

        }

        return max;
    }
}
