public class Main {

    public static void main(String[] args){

       //Test cases
        Trie trie = new Trie();
        trie.insert("ABCD");
        trie.insert("ABB");
        trie.insert("ABBKK");
        trie.insert("ABCEFG");

        System.out.println(trie.check("ABCD"));
        System.out.println(trie.check("ABDD"));
        System.out.println(trie.check("ABCEFG"));
        System.out.println(trie.check("ABB"));

        trie.traverse();
        trie.delete("ABB");
        System.out.println();
        trie.traverse();
    }
}
