package Progress.Recursion;

public class exponential {
    public static int caculateExponential(int n){
        if(n == 0) return 1;
        return n*caculateExponential(n-1);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(caculateExponential(n));
    }
}
