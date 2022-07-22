package Progress.Array;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int climb = 0;
        while(climb < arr.length-1 && arr[climb] < arr[climb+1]){
            climb++;
        }
        if(climb == 0 || climb == arr.length-1) return false;
        
        while(climb < arr.length-1 && arr[climb] > arr[climb+1]){
            climb++;
        }
        if(climb == arr.length-1) return true;
        return false;
    }
    public static void main(String[] args) {
        int []nums = {3,5,5};
        System.out.println(validMountainArray(nums));
    }
}
