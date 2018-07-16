package coding_bat.warmup2;

/**
 * Created by gaston on 25/07/16.
 * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
 */
public class Array123 {
    public static void main(String args[]){
        int [] array1 = {1, 1, 2, 3, 1};    //true
        int [] array2 = {1, 1, 2, 4, 1};    //false
        int [] array3 = {1, 1, 2, 1, 2, 3}; //true
        int [] array4 = {1, 2, 3};          //true
        int [] array5 = {1, 2};             //false
        int [] array6 = {1};                //false
        int [] array7 = {1,4,2,4,3,4};      //false
        int [] array8 = {1,1,2,2,3,3};      //false
        int [] array9 = {4,5,1,2,6};        //false
        int [] array10 = {4,5,1,2,3,6};     //true
        int [] array11 = {1,1,1,2,3,3};     //true
        System.out.println(array123(array1));
        System.out.println(array123(array2));
        System.out.println(array123(array3));
        System.out.println(array123(array4));
        System.out.println(array123(array5));
        System.out.println(array123(array6));
        System.out.println(array123(array7));
        System.out.println(array123(array8));
        System.out.println(array123(array9));
        System.out.println(array123(array10));
        System.out.println(array123(array11));
    }

    public static boolean array123(int[] nums) {
        int[] a123 = {1,2,3};
        int index = 0;

        for(int i = 0; i < nums.length ; i++){
            if(nums[i] == a123[index]){
                index++;
                if(index == 3){
                    break;
                }
            }else if(nums[i] == a123[0]){
                index = 1;
            }else{
                index = 0;
            }
        }
        return index == a123.length;
    }
}
