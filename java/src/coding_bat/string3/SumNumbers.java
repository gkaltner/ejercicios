package coding_bat.string3;

/**
 * Created by gaston on 01/08/16.
 *
 * Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
 * A number is a series of 1 or more digit chars in a row.
 * (Note: Character.isDigit(char) tests if a char is one of the chars '0', '1', .. '9'.
 * Integer.parseInt(string) converts a string to an int.)
 */
public class SumNumbers {
    public static void main(String []args){
        System.out.println(sumNumbers("abc123xyz")); // 123
        System.out.println(sumNumbers("aa11b33")); // 44
        System.out.println(sumNumbers("7 11")); // 18
    }

    public static int sumNumbers(String str) {
        String [] aStr= str.split("\\D");
        int sum = 0;
        for(int i = 0; i < aStr.length; i++){
            if(aStr[i].length() >0){
                sum += Integer.parseInt(aStr[i]);
            }
        }
        return sum;
    }

}
