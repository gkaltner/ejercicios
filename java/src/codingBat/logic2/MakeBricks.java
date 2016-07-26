package codingBat.logic2;

/**
 * Created by gaston on 25/07/16.
 *
 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big bricks (5 inches each).
 * Return true if it is possible to make the goal by choosing from the given bricks.
 * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks
 */
public class MakeBricks {
    public static void main(String args[]){
        System.out.println(makeBricks(3, 1, 8)); //true
        System.out.println(makeBricks(12, 1, 17)); //true
        System.out.println(makeBricks(3, 1, 9)); //false
        System.out.println(makeBricks(3, 2, 10));//true
        System.out.println(makeBricks(3, 2, 8)); //true
        System.out.println(makeBricks(1, 2, 8)); //false
        System.out.println(makeBricks(1, 4, 11)); // true
        System.out.println(makeBricks(3, 1, 7)); //true
        System.out.println(makeBricks(1000000, 1000, 1000100));//true

    }

    public static boolean makeBricks(int small, int big, int goal) {
        int result = goal;
        if(goal / 5 <= big){
            result -= goal / 5 * 5;
        }else{
            result -= big * 5;
        }

        return result <= small;
    }

}
