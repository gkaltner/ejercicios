package entrevistas;

import java.util.Arrays;

/**
 * Dado un array de numeros positivos y negativos desordenados.
 * Encontrar la subsecuencia de numeros consecutivos cuya suma sea la mayor entre todas.
 */
public class MaxSumSubsequence {
    public static void main(String [] args){
        int[] a1 = {1,-3,5,7,-9,2,1};
        int[] a3 = {1,-3,5,-7,-9,2,1,6,-21,5};
        int[] a2 = null;
        for(int i: mss(a3)){
            System.out.println(i);
        }
    }

    static int[] mss(int[] enteros){
        int[] subSet = {};
        if(enteros == null || enteros.length <= 0){
            return subSet;
        }
        int maxNum = enteros[0];
        int idxInit = 0, idxFin = 0;
        for(int i=0; i < enteros.length; i++){
            int sum = enteros[i];
            for(int j=i+1; j < enteros.length; j++){
                sum += enteros[j];
                if(maxNum < sum){
                    maxNum = sum;
                    idxInit = i;
                    idxFin = j;
                }
            }
        }
        return Arrays.copyOfRange(enteros,idxInit,idxFin+1);
    }
}
