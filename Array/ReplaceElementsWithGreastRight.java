package Progress.Array;

public class ReplaceElementsWithGreastRight {
    //way 1:
    // public static int[] replaceElements(int[] arr) {
    //     if(arr.length == 1) return new int[] {-1};
    //     for(int i=0; i<arr.length-1; i++){
    //        arr[i] = max(i+1,arr); 
    //     }
    //     arr[arr.length-1] = -1;
    //     return arr;
    // }
    // public static int max (int element, int[] arr) {
    //     int max = 0;
    //     for(int i=element; i<arr.length; i++){
    //         if(arr[i] > max){
    //             max = arr[i];
    //         }
    //     }
    //     return max;
    // }
    //way 2:
    public static int[] replaceElements(int[] arr) {
        int n = arr.length;
        //find max element from the end of the array
        for(int i=n-1; i>=0; i--){
            if(i!=n-1){
                arr[i] = Math.max(arr[i],arr[i+1]);
            }
        }
        // shift every elements to the left side
        for(int i=1; i<n; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = -1;
        return arr;
    }
    public static void main(String[] args) {
        int []nums = {17,18,5,4,6,1};
        for (int i : replaceElements(nums)) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
