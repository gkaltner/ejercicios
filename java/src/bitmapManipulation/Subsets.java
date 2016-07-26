package bitmapManipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaston Kaltner on 26/07/15.
 * e-mail: gaston.kaltner@gmail.com
 */
public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> set= new ArrayList<List<Integer>>();
        double cantElements = Math.pow(2,nums.length);
        for (int i=0;i < cantElements; i++){
            ArrayList<Integer> integers = new ArrayList<Integer>();
            for (int j=0;j < nums.length; j++){
                if((i & (1<<j))>0){
                    integers.add(nums[j]);
                }
            }
            set.add(integers);
        }
        return set;
    }
}
