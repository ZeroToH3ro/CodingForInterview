package Progress.BasicAlgorithm;

import java.util.Arrays;

public class BackTrackingBasic {
    private static String[] colors = {" red ", " green ", " blue ", " yellow ", " purple "};
    private static int[] selections = new int[colors.length];
    private static int[] validValues = {0, 1};
    private static int count = 0;

    private static void backTrack(int curIndex){
        for(int i=0; i<validValues.length; i++){
            selections[curIndex] = validValues[i];
            if(curIndex == colors.length-1){
                process(selections);
            } else {
                backTrack(curIndex + 1);
            }
        }
    }

    public static void process(int []selections){
        String mixColor = "";
        for(int i=0; i<selections.length; i++){
            if(selections[i] == 1){
                mixColor += colors[i];
            }
        }
        count++;
        System.out.println(count+"-New colors: "+mixColor);
        System.out.println(Arrays.toString(selections));
    }
    public static void main(String[] args) {
        backTrack(0);
    }
}
