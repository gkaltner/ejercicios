package coding_bat.array2;

/**
 * Created by Gaston Kaltner on 18/09/16.
 * Return true if the array contains, somewhere,
 * three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.
 * tripleUp([1, 4, 5, 6, 2]) → true
 * tripleUp([1, 2, 3]) → true
 * tripleUp([1, 2, 4]) → false
 */
public class TripleUp {
    public static void main(String []args){
        int [] array1 = {1, 4, 5, 6, 2};
        System.out.println(tripleUp(array1)); // true
        int [] array2 = {1, 2, 3};
        System.out.println(tripleUp(array2)); // true
        int [] array3 = {1, 2, 4};
        System.out.println(tripleUp(array3)); // false
    }

    public static boolean tripleUp(int[] nums) {
        int count = 0;
        for(int i=0; nums.length > 2 && i < nums.length-1; i++){
            if(nums[i+1] - nums[i] == 1){
                count ++;
            }else{
                count = 0;
            }

            if(count == 2){
                return true;
            }
        }
        return false;
    }
}



