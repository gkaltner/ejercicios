package entrevistas;

import java.io.*;
import java.util.*;

/**
 * Devise a function that gets one parameter 'w' and returns all the anagrams for 'w' from the file wl.txt.
 * The file wl.txt contains a huge list of valid words and the idea is to find the anagrams of ‘w’ included in such a list.
 *
 * "Anagram": An anagram is a type of word play, the result of rearranging the letters of a word or
 * phrase to produce a new word or phrase, using all the original letters exactly once; for example
 * orchestra can be rearranged into carthorse.
 *
 * anagrams("horse") should return:
 * ['heros', 'horse', 'shore']
 *
 * You can assume the absolute/relative path to wl.txt to be fixed and, therefore hardcore in the code,
 * or you can also change the firm of the method to for example anagrams("horse", ./wl.txt).
 */
public class Anagram {

    public static void main(String [] args) {
        List<String> list = anagram("horse");
        list.forEach(System.out::println);
    }

    private static List<String> anagram(final String word) {
        final String wl = Class.class.getClassLoader().getResource("wl.txt").getFile();
        List<String> anagrams = new ArrayList<>();
        try (BufferedReader in = new BufferedReader(new FileReader(wl))){
            String line;
            while ((line = in.readLine()) != null ){
                if(isAnagramOf(word,line)){
                    anagrams.add(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return anagrams;
    }

    private static boolean isAnagramOf(final String word1, final String word2) {
        char [] sequence = word1.toCharArray();
        for (char c : sequence) {
            if (word2.indexOf(c) == -1){
                return false;
            }
        }
        return true;
    }
}

/*
h
 o
  r
   s
    e
   e
    s
  s
   r
    e
   e
    r
  e
   s
    r
   r
    s
 */



