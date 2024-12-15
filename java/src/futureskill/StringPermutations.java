package futureskill;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class StringPermutations {


  public static void main(String[] args) {
    var string1 = List.of("ab", "ba", "aa");
    var string2 = List.of("abcc", "bda", "aca");
    System.out.println(level1CommonLetters(string1).equals("aab"));
    System.out.println(level1CommonLetters(string2).equals("aabccd"));
  }


  public static String level1CommonLetters(List<String> listOfStrings) {
    var hash =  new HashMap<Character,List<Integer>>();
    listOfStrings.forEach(s -> {
      var map = new HashMap<Character,Integer>();
      for (int i = 0; i < s.length(); i++) {
        final var c = s.charAt(i);
        map.put(c, map.getOrDefault(c, 0) + 1);
      }
      map.forEach((k,v) -> {
        if (hash.containsKey(k)) {
          hash.get(k).add(v);
        } else {
          var list = new ArrayList<Integer>();
          list.add(v);
          hash.put(k, list);
        }
      });
    });
    List<String> strings = new ArrayList<>();
    for (var entry : hash.entrySet()) {
      int max = 0;
      for(Integer amount :entry.getValue()){
        max = max < amount ? amount : max;
      }
      for(int i = 0;i<max;i++){
        strings.add(entry.getKey()+"");
      }
    }
    strings.sort(String::compareTo);
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < strings.size(); i++) {
      builder.append(strings.get(i));
    }
    return builder.toString();
  }

}
