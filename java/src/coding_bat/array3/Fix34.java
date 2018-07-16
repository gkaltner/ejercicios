package coding_bat.array3;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's,
 * but every other number may move. The array contains the same number of 3's and 4's,
 * every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.
 */
public class Fix34 {
    public static void main(String [] args){
        int [] vector = {1, 3, 1, 4};
        System.out.println(Arrays.stream(fix34(vector))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",","[","]")));//→ [1, 3, 4, 1]
        int [] vecto2 = {1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.stream(fix34(vecto2))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",","[","]")));//→ [1, 3, 4, 1, 1, 3, 4]
        int [] vecto3 = {3, 2, 2, 4};
        System.out.println(Arrays.stream(fix34(vecto3))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",","[","]")));//→ [3, 4, 2, 2]
        int [] vecto4 = {4, 3, 1, 1, 4, 3, 1};
        System.out.println(Arrays.stream(fix34(vecto4))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",","[","]")));//→ [1, 3, 4, 1, 1, 3, 4]
        int [] vecto5 = {3,4};
        System.out.println(Arrays.stream(fix34(vecto5))
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(",","[","]"))); //→ [3, 4]
    }

    static int[] fix34(int[] nums) {
        int aux;
        for(int i= 0; i < nums.length; i++) {
            if(nums[i] == 3) {
                i++;
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && (j== 0 || j-1 >= 0 && nums[j-1] != 3)){
                        aux = nums[i];
                        nums[i] = nums[j];
                        nums[j] = aux;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
