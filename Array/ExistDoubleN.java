package Progress.Array;

public class ExistDoubleN {
    public static boolean checkIfExist(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr.length; j++){
                if(i != j && arr[i] == 2*arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int []nums = {10,2,5,3};
        System.out.println(checkIfExist(nums));
    }
}
