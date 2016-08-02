package codingBat.string2;

/**
 * Created by gaston on 01/08/16.
 *
 * Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
 * separated by the separator string.
 */
public class RepeatSeparator {

    public static void main(String []args){
        System.out.println(repeatSeparator("Word", "X", 3));// "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// "This"
    }

    public static String repeatSeparator(String word, String sep, int count) {
        StringBuilder str = new StringBuilder();
        for(int i = 0;i < count; i++ ){
            if(i>0 && i < count){
                str.append(sep);
            }
            str.append(word);
        }
        return str.toString();
    }

}
