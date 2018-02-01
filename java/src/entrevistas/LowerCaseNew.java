package entrevistas;

import java.util.*;

/**
 * You are given a set containing an entire alien alphabet containing both uppercase, lowercase,
 * and non-case characters such as punctuation. You are also given a function called toUpper.
 * This method will return an uppercase if a lower case letter is provided,
 * or return the same character if an uppercase or no-case character is provided.  Write the method toLower.
 *
 */
public class LowerCaseNew {

    static Character [] alphabet = {'a','b','c','d','e','f','g','A','B','C','D','E','F','G','.',',',';'};
    static int cantChars = 0;


    public static void main(String [] args) {

    }


    public class NewUpperCase{
        ArrayList<Character> lower = new ArrayList<Character>();
        ArrayList<Character> upper = new ArrayList<Character>();

        public NewUpperCase(char [] alphabet){
            for(int i= 0; i < alphabet.length; i++ ){
                char c = alphabet[i];
                char cUp = Character.toUpperCase(c);
                if(c != cUp ){
                    upper.add(cUp);
                    lower.add(c);
                }
            }
        }


        public ArrayList toLowerCase(char [] chars){
            ArrayList<Character> newArray = new ArrayList<Character>();
            for(char c:chars){
                newArray.add(this.toLowerCase(c));
            }
            return newArray;
        }


        public char toLowerCase(char ch){
            for(char cu : this.upper){
                if(ch == cu){
                    return this.lower.get(upper.indexOf(cu));
                }
            }
            return ch;

        }
    }
}
