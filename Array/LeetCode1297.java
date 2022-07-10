package Progress.Array;

public class LeetCode1297 {
    public static int maximumWealth(int [][]accounts){
        int numberAccounts = accounts.length;
        int numberBanks = accounts[0].length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numberAccounts; i++){
            int temp = 0;
            for(int j=0; j<numberBanks; j++){
                temp += accounts[i][j];
            }
            if(max < temp) max = temp;
        }
        return max;
    }

    public static void main(String[] args) {
        int [][]accounts = {{2,8,7},
                            {7,1,3},
                            {1,9,5}};
        System.out.println(maximumWealth(accounts));
    }
}
