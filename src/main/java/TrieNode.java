import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public Map<Character, TrieNode> child = new HashMap<Character, TrieNode>();
    public boolean isWord;
}
