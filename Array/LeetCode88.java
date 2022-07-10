package Progress.Array;

public class LeetCode88  {
    public static void merge (int[]n1, int m, int []n2, int n){
            for(int element : n2){
                insertElement(element, n1, m);
                m++;
            }
    }
    public static void insertElement(int element, int[]n1, int m){
        boolean isChecked = false;
        for(int i=0 ;i<m ;i++){
            if(n1[i] > element){
                isChecked = true;
                for(int j=m-1; j>=i; --j){
                    n1[j+1] = n1[j];
                }
                n1[i] = element;
                break;
            }
        }
        if(isChecked == false){
            n1[m] = element;
        }
    }
    public static void println(int[]n1, int m){
        for (int i : n1) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int []n1 = {1,2,3,0,0,0};
        int []n2 = {2,5,6};
        // System.out.println(n1.length);
        merge(n1,3,n2, 3);
        println(n1, n1.length);
    }
}