package Progress.Array;

public class HeightChecker {
    
    public static int heightChecker(int[] heights){
        int count = 0;
        int n = heights.length-1;        
        int []expected = new int[n+1];
        for (int i=0; i<n+1; i++) {
            expected[i] = heights[i];
        }
        quickSorting(heights, 0, n);
        for(int i = 0; i < heights.length; i++){
            if(heights[i] != expected[i]){
                count++;
            }
        }
        return count;
    }
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
        int []nums = {1,1,4,2,1,3};
        System.out.println(heightChecker(nums));
    }
}
