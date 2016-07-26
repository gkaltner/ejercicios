package collections;

import java.util.HashMap;

/**
 * Created by Gaston Kaltner on 29/07/15.
 * e-mail: gaston.kaltner@gmail.com
 */
public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i], false);
        }

        int len,maxLen = 0;
        for(int i = 0;i<nums.length;i++){
            if(!map.get(nums[i])){
                len = 1+buscarConsecutivo(map,nums[i]-1,-1);
                len += buscarConsecutivo(map,nums[i]+1,1);
                maxLen = Math.max(maxLen,len);
            }
        }
        System.out.println("Largo Maximo: " + maxLen);
        return maxLen;
    }

    private static int buscarConsecutivo(HashMap<Integer, Boolean> map, int num, int step) {
        int len = 0;
        while(map.containsKey(num)){
            ++len;
            map.put(num,true);
            num += step;
        }
        return len;
    }
}
