package coding_bat.array3;

/**
 * Given a non-empty array, return true if there is a place to split the array so that the sum of
 * the numbers on one side is equal to the sum of the numbers on the other side.
 */
public class CanBalance {

    public static void main(String [] args){
        int [] vector = {1, 1, 1, 2, 1};
        System.out.println(canBalance(vector));//→ true
        int [] vector2 = {2, 1, 1, 2, 1};
        System.out.println(canBalance(vector2)); //→ false
        int [] vector3 = {10, 10};
        System.out.println(canBalance(vector3)); //→ true
        int [] vector4 = {1};
        System.out.println(canBalance(vector4)); //→ false
        int [] vector5 = {1,2,3,4,5,6,7};
        System.out.println(canBalance(vector5)); //→ false
        int [] vector6 = {1,2,3,4,5,10,5};
        System.out.println(canBalance(vector6)); //→ true
         int [] vector7 = {1,2,3,4,5,15};
        System.out.println(canBalance(vector7)); //→ true
        int [] vector8 = {15,1,2,3,4,5};
        System.out.println(canBalance(vector8)); //→ true
    }

    static boolean canBalance(int[] nums) {
        int leftAmount = 0;
        int rigthAmount;

        for(int i= 0; i < nums.length; i++){
            rigthAmount = 0;
            for(int j = i; j < nums.length; j++){
                rigthAmount +=nums[j];
            }
            if(leftAmount == rigthAmount) {
                return true;
            }
            leftAmount += nums[i];
        }
        return false;
    }

}
