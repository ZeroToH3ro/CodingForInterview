package Progress.Array;

public class LeetCode387 {
    public static int firstUniqChar(String input){
        int []count = new int [123];
        for(int i=0; i<input.length() ;i++){
            char c = input.charAt(i);
            int index = (int)c;
            count[index]++;
        }
        for(int i=0; i<input.length() ;i++){
            char c = input.charAt(i);
            int index = (int)c;
            if(count[index] == 1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String input = "leetcode";
        System.out.println(firstUniqChar(input));
    }
}
