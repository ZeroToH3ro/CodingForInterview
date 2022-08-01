package Progress.HashTable;

import java.util.ArrayList;
import java.util.Arrays;

public class MyHashTable {
    private final int size = 1000;
    //create two dimensional array of bucket
    private ArrayList<Integer>myBuckets[];

    public MyHashTable (){
        myBuckets = new ArrayList [size];
        for(int i = 0; i < myBuckets.length; i++){
            myBuckets[i] = new ArrayList<>();
        }
    }
    //find index of the bucket
    private int hashFunction(int key){
        return key % size;
    }
    public void add(int key){
        //encrypt the key
        int hashValueIndex = hashFunction(key);
        //take data into bucket at hashValueIndex
        var bucket = myBuckets[hashValueIndex];
        //check index whether exist
        int index = bucket.indexOf(key);
        //if not exist, add data to bucket
        if(index < 0){
            bucket.add(key);
        }
    }
    public void remove(int key){
        //encrypt the key
        int hashValueIndex = hashFunction(key);
        //take data into bucket at hashValueIndex
        var bucket = myBuckets[hashValueIndex];
        //check index whether exist
        int index = bucket.indexOf(key);
        //if not exist, add data to bucket
        if(index >= 0){
            bucket.remove(index);
        }
    }
    public boolean contain(int key){
        //encrypt the key
        int hashValueIndex = hashFunction(key);
        //take data into bucket at hashValueIndex
        var bucket = myBuckets[hashValueIndex];
        //check index whether exist
        int index = bucket.indexOf(key);
        //if not exist, add data to bucket
        return index >= 0 ? true : false;
    }
    public static void main(String[] args) {
        MyHashTable myHash = new MyHashTable();
        myHash.add(1);
        myHash.add(2);
        myHash.add(1);
        System.out.println("my set contain: "+ myHash.contain(1));
        myHash.remove(1);
        System.out.println("my set contain: "+ myHash.contain(1));
    }
}
