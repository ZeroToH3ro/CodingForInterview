package Progress.StackQueue;

public class PerfectSquare {   
    public static int numSquares(int n){
        int ans = n;
        if(ans <= 3) return ans;
        for(int i=1; i*i<=n; ++i){
            ans = Math.min(ans, 1+numSquares(n-i*i));
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(numSquares(n));
    }    
}
