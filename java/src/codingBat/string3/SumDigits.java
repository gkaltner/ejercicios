package codingBat.string3;

/**
 * Created by gaston on 01/08/16.
 *
 * Given a string, return the sum of the digits 0-9 that appear in the string,
 * ignoring all other characters. Return 0 if there are no digits in the string.
 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 * Integer.parseInt(string) converts a string to an int.)
 */
public class SumDigits {

    public static void main(String []args){
        System.out.println(sumDigits("aa1bc2d3")); // 6
        System.out.println(sumDigits("aa11b33")); // 8
        System.out.println(sumDigits("Chocolate")); // 0
    }

    public static int sumDigits(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(Character.toString(str.charAt(i)));
            }
        }
        return sum;
    }

}
