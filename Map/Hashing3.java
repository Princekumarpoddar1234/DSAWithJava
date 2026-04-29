import java.util.ArrayList;
import java.util.LinkedList;
public class Hashing3 {
    static class HashMap<K,V>{
    private class Node{
        K key;
        V value;

        public Node(K key, V value){
            this.key =key;
            this.value=value;
        }
    }
    private int n;
    private int N;
    private LinkedList<Node> bucket[];

    @SuppressWarnings("unchecked")
    public HashMap(){
        this.N=4;
        this.bucket = new LinkedList[4];
        for(int i=0; i<4; i++){
            this.bucket[i]=new LinkedList<>();
        }
    }
    private int hashFunction(K key){
        int hc=key.hashCode();
        return Math.abs(hc)%N;
    }
    private int SearchInLL(K key, int bi){
        LinkedList<Node> ll = bucket[bi];
        for(int i=0; i<ll.size(); i++){
            Node node = ll.get(i);
            if(node.key.equals(key)){
                return i;
            }
        }
        return -1;
    }
    private void rehash(){
        LinkedList<Node>[] oldBuck = bucket;
        int oldN=N;//we are storing the old value of N just to know it for rehashing
        N*=2;
        @SuppressWarnings("unchecked")
        LinkedList<Node>[] newBucket = new LinkedList[N];
        bucket = newBucket;
        for(int i=0; i<bucket.length; i++){
            bucket[i]=new LinkedList<>();
        }
        for(int i=0; i<oldBuck.length; i++){
            LinkedList<Node> ll = oldBuck[i];
            while(!ll.isEmpty()){
                Node node =ll.remove();
                put(node.key,node.value);
            }
        }
    }
    public void put(K key, V value){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);
        if(di!=-1){
            Node node = bucket[bi].get(di);
            node.value=value;
        }else{
            bucket[bi].add(new Node(key,value));
            n++;
        }
        double lambda=(double)n/N;
        if(lambda>2.0){
            rehash();
        }
    }
    public boolean containsKey(K key){//O(lambda or 1)
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);
        if(di!=-1){
            return true;
        }else{
            return false;
        }
    }
    public V remove(K key){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);
        if(di!=-1){
            Node node = bucket[bi].remove(di);
            n--;
            return node.value;
        }else{
            return null;
        }
    }
    public V get(K key){
        int bi=hashFunction(key);
        int di=SearchInLL(key,bi);
        if(di!=-1){
            Node node = bucket[bi].get(di);
            return node.value;
        }else{
            return null;
        }
    }
    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for(int i=0; i<bucket.length; i++){
            LinkedList<Node> ll = bucket[i];
            for(Node node:ll){
                keys.add(node.key);
            }
        }
        return keys;
    }
    public boolean isEmpty(){
        return n==0;
    }
}
    public static void main(String[] args){
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",100);
        map.put("China",150);
        map.put("US",50);
        map.put("Nepal",5);
        map.put("Indonesia",6);
        map.put("Bhutan",1);

        ArrayList<String> keys = map.keySet();
        for(String key:keys){
            System.out.println(key);
        }
        System.out.println(map.get("India"));
        System.out.println(map.remove("China"));
        System.out.println(map.get("China"));
    }
}