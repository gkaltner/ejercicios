package codingBat.array2;

/**
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * Except the number 13 is very unlucky,
 * so it does not count and numbers that come immediately after a 13 also do not count.
 * sum13([1, 2, 2, 1]) → 6
 * sum13([1, 1]) → 2
 * sum13([1, 2, 2, 1, 13]) → 6
 */
public class Sum13 {

    public static void main(String []args){
        int [] array1 = {1, 2, 2, 1};
        System.out.println(sum13(array1)); // 6
        int [] array2 = {1, 1};
        System.out.println(sum13(array2)); // 2
        int [] array3 = {1, 2, 2, 1,13};
        System.out.println(sum13(array3)); // 6
        int [] array4 = {1, 2, 2, 1,13,3,6,7};
        System.out.println(sum13(array4)); // 6
        int [] array5 = {};
        System.out.println(sum13(array5)); // 0
        int [] array6 = {1, 2, 13, 2, 1, 13};
        System.out.println(sum13(array6)); // 4
        int [] array7 = {13, 1, 2, 13, 2, 1, 13};
        System.out.println(sum13(array7)); // 3
    }

    public static int sum13(int [] array){
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i]==13){
                i++;
                continue;
            }
            sum += array[i];
        }
        return sum;
    }
}