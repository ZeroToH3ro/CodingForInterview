package Progress.HashSet;

import java.util.ArrayList;

public class MyHashSet {
    private class Data{
        int key;
        int value;
        Data(int key, int value){
            this.key = key;
            this.value = value;
        }
        @Override
        public boolean equals(Object other){
            //compare key, ignore value
            if(other instanceof Data){
                return this.key == ((Data)other).key;
            }
            return false;
        }
    }
    private final int SIZE = 1000;
    private ArrayList<Data> myBuckets[];
    MyHashSet(){
        myBuckets = new ArrayList[SIZE];
        for(int i=0; i<myBuckets.length; i++){
            myBuckets[i] = new ArrayList<Data>();
        }
    }
    //return hashValueIndex
    public int hashFunction(int key){
        return key%SIZE;
    }
    public void put(int key, int value){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data newData = new Data(key, value);
        int keyIndex = bucket.indexOf(newData);
        if(keyIndex >= 0){
            bucket.get(keyIndex).value = value;
        } else {
            bucket.add(newData);
        }
    }
    public void remove(int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data myDeleteData = new Data(key, 0);
        bucket.remove(myDeleteData);
    }
    public int get (int key){
        int hashValueIndex = hashFunction(key);
        var bucket = myBuckets[hashValueIndex];
        Data myFindData = new Data(key, 0);
        int keyIndex = bucket.indexOf(myFindData);
        if(keyIndex >= 0){
            return bucket.get(keyIndex).value;
        }
        return -1;
    }

    public static void main(String[] args) {
        MyHashSet mySet = new MyHashSet();
        mySet.put(1,1 );
        mySet.put(1,2 );
        mySet.put(10,2 );
        System.out.println(mySet.get(1));
        mySet.remove(1);
        System.out.println(mySet.get(10));
    }
}
