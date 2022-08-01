package Progress.HashTable;

import java.util.Set;
import java.util.TreeSet;

public class HashSetLesson {

    public static void main(String[] args) {
        //TreeSet: print out elements in order
        //HashSet: print out elements in not order
        Set<Integer>set = new TreeSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);
        for (Integer integer : set) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }
}
