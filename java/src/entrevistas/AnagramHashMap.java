package entrevistas;


import java.util.HashMap;
import java.util.Map;

/**
 * "Anagram": An anagram is a type of word play, the result of rearranging the letters of a word or
 * phrase to produce a new word or phrase, using all the original letters exactly once; for example
 * orchestra can be rearranged into carthorse.
 * Saunas – Susana
 */
public class AnagramHashMap {


    public static void main(String[] args) {
        System.out.println(checkIfIsAnagram("saunas","susana"));

    }

    private static boolean checkIfIsAnagram(String word1, String word2) {
        var hashWord1 = getHashFromWord(word1);
        var hashWord2 = getHashFromWord(word2);

        return hashWord1.equals(hashWord2);
    }

    private static Map<Character,Integer> getHashFromWord(String word){
        Map<Character,Integer> characterCounts = new HashMap<>();
        for (char c : word.toLowerCase().toCharArray()) {
            if(characterCounts.containsKey(c)){
                characterCounts.put(c,characterCounts.get(c) +1);
            } else {
                characterCounts.put(c,1);
            }
        }
        return characterCounts;
    }
}
