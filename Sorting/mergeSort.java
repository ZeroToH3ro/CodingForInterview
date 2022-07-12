package Progress.Sorting;

import java.util.*;

public class mergeSort {
    public static int[] merge(int[] a1, int[] a2)
    {
         //i: index for result
        //i1: index for nums1
        //i2: index for nums2
        int n = a1.length + a2.length;
        int[] result = new int[n];

        int i = 0, i1 = 0, i2 = 0;
        while (i < n){
            if(i1 < a1.length && i2 < a2.length){ // a1 & a2 != Rong
                if(a1[i1] <= a2[i2]){ // a1 nho hon
                    result[i] = a1[i1];
                    i++; i1++;
                }else{// a2 nho hon
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }else{// a1 rong or a2 rong
                if(i1 < a1.length){ // a1 ok
                    result[i] = a1[i1];
                    i++; i1++;
                }else{ //a2 ok
                    result[i] = a2[i2];
                    i++; i2++;
                }
            }
        }

        return result;
    }
    public static int[] mergeSort(int nums[], int left, int right){
        //case special
        if(left > right) return new int[0];
        if(left == right){
            int []singleElement = {nums[left]};
            return singleElement;
        }
        //general case
        //divide
        System.out.println("Dive: " + left +"-"+right);
        int k = (left+right)/2;
        int []nums1 = mergeSort(nums, left, k);
        int []nums2 = mergeSort(nums, k+1, right);
        
        int []result = merge(nums1,nums2);
        return result;
    }
    public static int[] sortArray(int []nums){
        return mergeSort(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int []nums = {2,5,6,12,20,99};
        System.out.println(Arrays.toString(mergeSort(nums, 0, nums.length-1)));
    }
}
