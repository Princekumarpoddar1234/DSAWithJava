public class trie3 {
    static class Node{
        Node children[] = new Node[26];

        public Node(){
            for(int i=0; i<26; i++){
                children[i]=null;
            }
        }
    }
    public static Node root=new Node();
    public static void insert(String word){
        Node curr=root;
        for(char c:word.toCharArray()){
            int idx=c-'a';
            if(curr.children[idx]==null){
                curr.children[idx]= new Node();
            }
            curr=curr.children[idx];
        }
    }
    public static boolean startsWith(String word){
        Node curr=root;
        for(char c:word.toCharArray()){
            int idx=c-'a';
            if(curr.children[idx]==null) return false;
            curr=curr.children[idx];
        }
        return true;
    }
    public static void main(String[] args){
        String words[] ={"apple","app","mango","man","woman"};
        for(String word: words){
            insert(word);
        }
        System.out.println(startsWith("moon"));
    }
}
