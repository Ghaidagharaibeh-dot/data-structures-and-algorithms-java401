package hashTable;

import java.util.HashMap;
import java.util.Map;

public class HashTable<T> {
    Entry[] hashTableArr;
    int size;

    public HashTable(int size) {
        this.size = size;
        hashTableArr = new Entry[this.size];
        for (int i = 0; i< hashTableArr.length; i++)
            hashTableArr[i]=new Entry<T>();
    }


    public int getHash(int key) {
        return key % size;
    }



    public void add(int key ,T value){

            int index = getHash(key);
            Entry arrayValue = hashTableArr[index];
            Entry newItem = new Entry<T>(key,value);
            newItem.next=arrayValue.next;
            arrayValue.next=newItem;
    }

    public T get(int key){
        T value=null;
        int index = getHash(key);
        Entry arrayValue = hashTableArr[index];
        while (arrayValue!=null){
            if(arrayValue.getKey()==key){
                value=(T)arrayValue.getValue();
                break;
            }
            arrayValue=arrayValue.next;
        }

        return value;
    }

    public boolean contain(int key){
        T value=null;
        boolean x = false;
        int index = getHash(key);
        Entry arrayValue = hashTableArr[index];
        while (arrayValue!=null){
            if(arrayValue.getKey()==key){
                value=(T)arrayValue.getValue();
                x= true;
                break;
            }
            arrayValue=arrayValue.next;
        }

        return x;
    }



    public String repeatedWord(String text) throws Exception{
        if (text == null){
            throw new Exception("Empty Text!!");
        }
        String[] words = text.split(" ");
        String word= "";
        Map<String,String> wordMap = new HashMap<>();

        for (String s : words) {
            word = s.toLowerCase();
            if (wordMap.get(word) != null) {
                System.out.println("The First Repeated Word Is : " + word);
                break;
            } else {
                wordMap.put(word, word);
            }
        }
        return word;
    }

}
