package Progress.BinarySearch;

public class BinarySearchRecursive {
    public static int bSearch(int[] a, int key, int iLeft, int iRight)
    {
        if(iLeft > iRight)
            return -1;
        System.out.println("[" + iLeft  +", " + iRight +"]");
        
        int iMid = (iLeft + iRight)/2;

        if(key == a[iMid]){
            return iMid;
        }else if(key > a[iMid]){
            return bSearch(a, key, iMid + 1, iRight);
        }else{ // key < a[iMid]
            return bSearch(a, key, iLeft, iMid - 1);
        }

    }

    public static int bSearch(int[] a, int key)
    {
        int n = a.length;
        return bSearch(a, key, 0, n-1);
    }
    public static void main(String[] args) {
        
    }
}
