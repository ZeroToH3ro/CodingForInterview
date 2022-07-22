package Progress.Array;

public class InsertElements2Points {
    public static void insertElement(int n1[], int n, int n2[], int m){
        int i = n-1;
        int j = m-1;
        int k = (n+m)-1;
        while(k>=0){
            if(i<0){
                n1[k] = n1[j];
                j--; 
            } else if (j<0){
                n1[k] = n1[i];
                i--;
            } else if(n1[i] > n2[j]){
                n1[k] = n1[i];
                i--;
            } else {
                n1[k] = n1[i];
                j--;
            }
            k--;
        }
    }
    public static void main(String[] args) {
        int []nums1 = {2,5,6,6,7};
        int n = 2;
        int []nums2 = {1,2,3,4};
        int m = 3;
        insertElement(nums1, n, nums2, m);
        for (int i : nums1) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }
}
