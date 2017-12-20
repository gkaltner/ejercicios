package leetCode.Math;

/**
 * Created by Gaston Kaltner on 18/09/16.
 */
public class SumDigits {
    public static void main(String [] args){
        System.out.println(sumDigits(0)); //0
        System.out.println(sumDigits(3)); //3
        System.out.println(sumDigits(13)); //4
        System.out.println(sumDigits(123)); //6
        System.out.println(sumDigits(543)); //12
        System.out.println(sumDigits(876)); //21
    }

    public static int sumDigits(int number){
        int sum = 0;
        int i = 10;
        while (number > 0){
            sum += number % i;
            number = number / i;
        }
        return sum;
    }
}
