package codingBat.recursion1;

/**
 * Created by gaston on 25/07/16.
 * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks,
 * the next row has 3 blocks, and so on.
 * Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
 */
public class Triangule {
    public static void main(String args[]){
        System.out.println(triangle(0)); //0
        System.out.println(triangle(1)); //1
        System.out.println(triangle(2)); //3
    }

    public static int triangle(int rows) {
        return 0;
    }
}
