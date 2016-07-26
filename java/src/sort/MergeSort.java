package sort;

/**
 * Created by Gaston Kaltner on 26/07/15.
 * e-mail: gaston.kaltner@gmail.com
 */
public class MergeSort {
    public static int[] mergeSort(int[] numeros) {
        int n = numeros.length;
        if(n<2) return numeros;

        int mid = n/2;
        int [] left = new int[mid],right = new int[mid];
        for(int i = 0 ; i < mid;i++){
            left[i] = numeros[i];
        }
        for(int i = mid ; i < n;i++){
            right[i-mid] = numeros[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right){
        int nl = left.length;
        int nr = right.length;
        int i = 0, j= 0, k = 0;
        int [] merge = new int[nl + nr];
        while(i < nl && j < nr){
            if(left[i]<right[j]) {
                merge[k] = left[i];
                i++;
                k++;
            }else{
                merge[k] = right[j];
                j++;
                k++;
            }
        }
        while(i < nl){
            merge[k] = left[i];
            i++;
            k++;
        }
        while(j < nr){
            merge[k] = right[j];
            j++;
            k++;
        }
        return merge;
    }
}
