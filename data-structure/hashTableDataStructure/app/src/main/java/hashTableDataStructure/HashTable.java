package hashTableDataStructure;

tree_intersectionCC32
import org.w3c.dom.Node;


import java.util.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;

public class HashTable<K, V> {
    private ArrayList<HashNode<K, V>> bucketArray;

    private int numBuckets;

    private int size;

    public HashTable() {
        bucketArray = new ArrayList<>();
        numBuckets = 30;
        size = 0;

        for (int index = 0; index < numBuckets; index++) {
            bucketArray.add(null);
        }
    }
    private int hashCode(K key) {
        return Objects.hashCode(key);
    }

    private int getBucketIndex(K key) {
        int hashCode = hashCode(key);

        int index = hashCode % numBuckets;

        index = index < 0 ? index * -1 : index;

        return index;
    }
    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    public void add(K key, V value) {

        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);

        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                head.value = value;
                return;
            }

            head = head.next;
        }

        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K, V> newNode = new HashNode<>(key, value, hashCode);
        newNode.next = head;
        bucketArray.set(bucketIndex, newNode);

        if ((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            bucketArray = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            size = 0;

            for (int index = 0; index < numBuckets; index++) {
                bucketArray.add(null);
            }

            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V remove(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);
        HashNode<K, V> head = bucketArray.get(bucketIndex);

        HashNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key) && hashCode == head.hashCode)
                break;

            prev = head;
            head = head.next;
        }

        if (head == null)
            return null;

        size--;

        if (prev != null)
            prev.next = head.next;
        else
            bucketArray.set(bucketIndex, head.next);

        return head.value;
    }

    public V get(K key) {
        int bucketIndex = getBucketIndex(key);
        int hashCode = hashCode(key);

        HashNode<K, V> head = bucketArray.get(bucketIndex);
        while (head != null) {
            if (head.key.equals(key) && head.hashCode == hashCode) {
                return head.value;
            }

            head = head.next;
        }
        return null;
    }

    public boolean contains(K key) {
        if (key == null){
            throw new IllegalArgumentException("Cannot find a null key.");
        }
        return get(key) != null;
    }

    //    <<< Code Challenge 31 >>>

    //code challenge 31
    public String  repeatedWord(String strings){

        String allWords = strings.toLowerCase(Locale.ROOT);
        String [] token = allWords.split(" ");
        HashTable<String, Integer> hashMap = new HashTable<String, Integer>();


        for (String word : token){

            if(word.contains(",")){
                word = word.substring(0, word.length()-1);
            }

            if(!word.equals("")){

                int count = hashMap.get(word) != null ? hashMap.get(word) : 0;

                if (count == 1){
                    return word;
                }
                hashMap.add(word, count + 1);
            }
        }

        return "no repeated words";
    }

// tree_intersectionCC32

}
