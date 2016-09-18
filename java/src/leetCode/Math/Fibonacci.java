package leetCode.Math;

/**
 * Created by gaston on 9/18/16.
 */
public class Fibonacci {
    public static void main(String []args){
        fibonacci(150);
    }

    public static void fibonacci(int limit){
        fibonacci(limit,1,0);
    }

    public static void fibonacci(int limit,int curent,int previous){
        if(curent > limit){
            return;
        }
        System.out.println(curent);
        int next = curent + previous;
        fibonacci(limit,next,curent);
    }
}
