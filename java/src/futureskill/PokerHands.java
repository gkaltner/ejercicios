package futureskill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PokerHands {

  public static void main(String[] args) {
    List<String> hand1 = List.of("Ad", "Jd", "Td", "8d", "4d"); //should give True (it's a flush)
    List<String> hand2 = List.of("Ad", "Jd", "Th", "8d", "4d"); //should give False (no flush)
    System.out.println(level1IsFlush(hand1));
    System.out.println(level1IsFlush(hand2));

    List<String> hand3 = List.of("7c", "8d", "9h", "Ts", "Jc"); //should give True (it's a straight)
    List<String> hand4 = List.of("7c", "8d", "9h", "Js", "Qh"); //should give False (no straight)
    List<String> hand5 = List.of("Qd", "Tc", "Kd", "Jc", "9c"); //should give true
    List<String> hand6 = List.of("9h", "Kd", "Ts", "Jh", "Qd"); //should give true
    List<String> straight1 = List.of("Ad", "2d", "3d", "4d", "5d");//should give True
    List<String> straight2 = List.of("Td", "Jd", "Qd", "Kd", "Ad");//should give True
    System.out.println(level2IsStraight(hand3));
    System.out.println(level2IsStraight(hand4));
    System.out.println(level2IsStraight(straight1));
    System.out.println(level2IsStraight(straight2));
    System.out.println(level2IsStraight(hand5));
    System.out.println(level2IsStraight(hand6));

    List<String> hand7 = List.of("Qs", "Ts", "Ks", "Js", "As"); //should give True (it's a Royal straight flush)
    List<String> hand8 = List.of("9h", "Qh", "Kh", "Th", "Jh"); //should give False (no Royal straight flush)
    level3IsRoyalStraightFlush(hand7);
    level3IsRoyalStraightFlush(hand8);
  }

  public static boolean level3IsRoyalStraightFlush(List<String> hand) {


    if(!level1IsFlush(hand) || !level2IsStraight(hand)){
      return false;
    }

    for (String card : hand) {
      if(rankMap.get(card.charAt(0))< 10){
        return false;
      }
    }

    return true;
  }

  static Map<Character, Integer> rankMap = Map.ofEntries(
      Map.entry('2', 2), Map.entry('3', 3), Map.entry('4', 4), Map.entry('5', 5),
      Map.entry('6', 6), Map.entry('7', 7), Map.entry('8', 8), Map.entry('9', 9),
      Map.entry('T', 10), Map.entry('J', 11), Map.entry('Q', 12), Map.entry('K', 13),
      Map.entry('A', 14)
  );
   
  public static boolean level2IsStraight(List<String> hand) {
    if (hand != null && hand.size() != 5) {
      return false;
    }

    List<Integer> ranks = new ArrayList<>();
    for (String card : hand) {
      ranks.add(rankMap.get(card.charAt(0))); // Get rank value
    }
    Collections.sort(ranks);

    boolean isStraight = true;
    for (int i = 0; i < ranks.size() - 1; i++) {
      if (ranks.get(i + 1) - ranks.get(i) != 1) {
        isStraight = false;
        break;
      }
    }

    if (!isStraight && ranks.contains(14)) {
      // Replace Ace (14) with '1' and check again
      ranks.remove(Integer.valueOf(14));
      ranks.add(0, 1); // Add Ace as 1
      Collections.sort(ranks);

      isStraight = true;
      for (int i = 0; i < ranks.size() - 1; i++) {
        if (ranks.get(i + 1) - ranks.get(i) != 1) {
          isStraight = false;
          break;
        }
      }
    }

    return isStraight;
  }

  public static boolean level1IsFlush(List<String> hand) {
    if (hand != null && hand.size() != 5) {
      return false;
    }
    char firstCard = hand.get(0).charAt(1);
    for (int i = 1; i < hand.size() - 1; i++) {
      var value = hand.get(i).charAt(1);
      if (value != firstCard) {
        return false;
      }
    }
    return true;
  }

}
