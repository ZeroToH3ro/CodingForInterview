package Progress.Recursion;

public class fibonacci {
    public static int findNumberFiboNotUseRecursive(int number) {
        int[]Fibo = new int[number + 1];
        Fibo[1]=1;
        Fibo[2]=1;
        for(int i=3; i<=10; ++i){
            //Formular
            Fibo[i] = Fibo[i-1] + Fibo[i-2];
        } 
        return Fibo[number + 1];
    }
    public static int findNumberFibo(int number){
        if(number == 1 || number == 2) return 1;
        return findNumberFibo(number-1) + findNumberFibo(number-2);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(findNumberFibo(n));
        System.out.println(findNumberFiboNotUseRecursive(n));
    }
}
