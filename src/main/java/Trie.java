public class Trie {
    TrieNode root;
    Trie(){
        root = new TrieNode();
    }

    void insert(String word) {
         TrieNode temp = root;
         for (int i=0; i<word.length(); i++){
             if(!temp.child.containsKey(word.charAt(i))){
                 temp.child.put(word.charAt(i), new TrieNode());
             }
             temp = temp.child.get(word.charAt(i));
         }
         temp.isWord = true;
    }
    boolean check(String word) {
        TrieNode temp = root;
        for (int i=0; i<word.length(); i++) {
            if(!temp.child.containsKey(word.charAt(i))) {
                return false;
            }
            temp = temp.child.get(word.charAt(i));
        }
    return true;
    }
    void dfs(TrieNode root , String res){
            if(root.isWord){
                System.out.println(res);
            }
           for (char c : root.child.keySet()){
               res = res + c;
               dfs(root.child.get(c), res);
               res = res.substring(0,res.length()-1);
           }
    }
    void traverse(){
         String res = "";
           dfs(root,res);
    }
    void delete(String word){
        TrieNode temp = root;
        for (int i=0; i<word.length(); i++) {
            temp = temp.child.get(word.charAt(i));
        }
        temp.isWord = false;
    }
}
