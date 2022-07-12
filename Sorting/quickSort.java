package Progress.Sorting;

import java.util.Arrays;

public class quickSort {
    public static void quickSorting(int []a, int left, int right) {
        if(left >= right) return;
        //step 1: select key
        int key = a[(left + right)/2];
        //step2 : sort array by key
        int k = partition(a, left, right, key);
        //step 3: divide array => repeat
        quickSorting(a, left, k-1);
        quickSorting(a, k, right);
    }
    public static int partition(int []a, int left, int right, int key){
        int iLeft = left;
        int iRight = right;
        while(iLeft <= iRight){
            //find the element >= key
            //with iLeft find the element >= key to swap
            while(a[iLeft] < key) iLeft++;
            //with iRight find the element <= key to swap
            while(a[iRight] > key) iRight--;
            //swap two elements
            if(iLeft <= iRight){
                int temp = a[iLeft]; 
                a[iLeft] = a[iRight];
                a[iRight] = temp;
                iLeft++;
                iRight--;
            }
        }
        return iLeft;
    }
    public static void main(String[] args) {
        int []a = {6,7,8,5,4,1,2,3};
        quickSorting(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
