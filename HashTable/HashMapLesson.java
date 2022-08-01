package Progress.HashTable;

import java.util.HashMap;
import java.util.Map;

public class HashMapLesson {
    public static void main(String[] args) {
        int []arr = {1,2,3,1,2};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        //key: value of element in array
        //value: the time exist in array
        for(int i:arr){
            if(map.containsKey(i) == false){
                map.put(i,1);
            } else {
                int countExist = map.get(i);
                countExist++;
                map.put(i, countExist);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " exist " + entry.getValue()+" times");
        }
    }
}
