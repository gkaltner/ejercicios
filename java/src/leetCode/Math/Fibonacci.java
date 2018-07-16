package leetCode.Math;

/**
 * Created by gaston on 9/18/16.
 */
public class Fibonacci {
    public static void main(String []args){
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacci(i)+" ");
        }
    }

    /*public static void fibonacci(int limit){
        fibonacci(limit,1,0);
    }

    public static void fibonacci(int limit,int curent,int previous){
        if(curent > limit){
            return;
        }
        System.out.println(curent);
        int next = curent + previous;
        fibonacci(limit,next,curent);
    }*/

    public static int fibonacci(int number) {
        if(number > 1) {
          return fibonacci(number-1) + fibonacci(number -2);
        }
        if(number == 1 || number == 0){
            return number;
        } else {
            System.out.println("Debes ingresar un tamaño mayor o igual a 1");
            return -1;
        }
    }
}
