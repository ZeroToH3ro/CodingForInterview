package Progress.Array;

public class LeetCode1295 {
    public static int findEvenDigitsNumber(int numbers[]){
        int count = 0;
        for (int element : numbers) {
            int digitsNumber = countDigitNumber(element);
            if(digitsNumber % 2 == 0){
            count++;
        }
        }
        return count;
    }
    public static int countDigitNumber(int element){
        int count = 0;
        int result = element;
        while(result != 0){
            count++;
            result /= 10;
        }
        return count;
    }
    public static void main(String[] args) {
        int []numbers = {1,2,12,345,5678};
        System.out.println(findEvenDigitsNumber(numbers));
    }
}
