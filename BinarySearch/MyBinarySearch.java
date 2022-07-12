package Progress.BinarySearch;

public class MyBinarySearch {
    public static int binarySearch(int nums[], int key){
        int n = nums.length;
        int iLeft = 0;
        int iRight = n - 1;
        while(iLeft <= iRight){
            int mid = (iLeft + iRight) / 2;
            if(nums[mid] == key){
                return mid;
            } else if (nums[mid] < key){
                iLeft = mid + 1;
            } else {
                iRight = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []nums = {2,5,6,12,20,99};
        System.out.println(binarySearch(nums,20));
    }
}
