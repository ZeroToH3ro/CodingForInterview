package Progress.Array;

public class LeetCode27 {
    public static void removeElements(int n2[], int value){
        int lengthOfArray = n2.length;
        for(int i=0; i<lengthOfArray;){
            if(n2[i] == value){
                for(int j=i; j<=lengthOfArray-2; j++){
                    n2[j] = n2[j+1];
                }
                --lengthOfArray;
            } else {
                i++;
            }
        }
    }
    public static void print(int n2[]){
        for (int i=0; i<n2.length; i++) {
            System.out.print(n2[i]+"\t");
        }
    }
    public static void main(String[] args) {
        int []n2 = {2,5,6,6,7};
        removeElements(n2, 6);
        print(n2);
    }
}
