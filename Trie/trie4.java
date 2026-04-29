public class trie4 {
    static class Node{
        Node child[] = new Node[26];

        public Node(){
            for(int i=0; i<26; i++){
                child[i]=null;
            }
        }
    }
    public static Node root= new Node();
    public static void insert(String word){
        Node curr=root;
        for(char c: word.toCharArray()){
            int idx=c-'a';
            if(curr.child[idx]==null){
                curr.child[idx]= new Node();
            }
            curr=curr.child[idx];
        }
    }
    public static int countNode(Node root){
        if(root==null) return 0;
        int count=0;
        for(int i=0; i<26; i++){
            if(root.child[i]!=null){
                count+=countNode(root.child[i]);
            }
        }
        return count+1;
    }
    public static void main(String[] args){
        String str="ababa";
        //creation and insertion of suffix to trie
        for(int i=0; i<str.length(); i++){
            String word=str.substring(i);
            insert(word);
        }

        System.out.println(countNode(root));
    }
}
