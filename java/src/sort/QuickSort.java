package sort;

/**
 * Created by Gaston Kaltner on 26/07/15.
 * e-mail: gaston.kaltner@gmail.com
 */
public class QuickSort {
    public static void sort(int []a,int start,int end){
        //if(start < end) {
        int pIndex = partition(a, start, end);
        if(start < pIndex -1)
            sort(a, start, pIndex - 1);
        if(end > pIndex)
            sort(a, pIndex, end);
        //}
    }

    private static int partition(int[] a, int start, int end) {
        int pivot = a[start];
        while(start<=end){
            while(a[start] <pivot){
                start++;
            }
            while (a[end] > pivot){
                end--;
            }
            if(start <= end){
                swap(a,start,end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] a, int i, int pIndex) {
        int aux;
        aux = a[i];
        a[i] = a[pIndex];
        a[pIndex] = aux;
    }
}
