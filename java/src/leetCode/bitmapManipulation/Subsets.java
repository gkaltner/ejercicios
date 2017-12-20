package leetCode.bitmapManipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gaston Kaltner on 26/07/15.
 * e-mail: gaston.kaltner@gmail.com
 */
public class Subsets {
    public static void main(String[] args) {
        int[] conjunto = {1, 2, 3};
        subsets(conjunto);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(11 & 10);
        System.out.println(Math.pow(2, conjunto.length));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        int condition;
        List<List<Integer>> set = new ArrayList<List<Integer>>();
        double cantElements = Math.pow(2, nums.length);
        for (int i = 0; i < cantElements; i++) {
            ArrayList<Integer> integers = new ArrayList<Integer>();
            for (int j = 0; j < nums.length; j++) {
                condition = (i & (1 << j));
                System.out.println(Integer.toBinaryString(i) + " & " + Integer.toBinaryString(1 << j) + " = " + (i & (1 << j)));
                if (condition > 0) {
                    System.out.println(Integer.toBinaryString(condition) + " --> " + nums[j]);
                    integers.add(nums[j]);
                }
            }
            System.out.println("----------");
            set.add(integers);
        }
        return set;
    }
}
