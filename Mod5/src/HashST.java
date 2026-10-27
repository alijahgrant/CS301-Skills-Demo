//Implement the following methods for HashST.java (pg. 638 in your textbook):
//contains(): Returns true if this symbol table contains the specified key.
//size(): Returns the number of key-value pairs in this symbol table.
//keys(): Returns all keys in the symbol table.
public class HashST<Key, Value> {
    private int m;
    private Node[] lists;

    private class Node{
        private Object key;
        private Object val;
        private Node next;
        public Node(Object key, Object val, Node next)
        {
            this.key = key;
            this.val = val;
            this.next = next;
        }
    }
    public Object keys(){
        int x = 0;
        Object[] n = new Object[lists.length];
        for(int i = 0; i < lists.length-1; i++){
            if(lists[i]!=null){
                n[x]= lists[i];
                x++;
            }

        }
        return n;
    }
    public int size(){
        int x=0;
        for(int i = 0; i < lists.length-1; i++){
            if(lists[i]!=null){
                x++;
            }

        }
        return x;
    }
    public boolean contains(Key key){
        return lists[hash(key)] == key;
    }
    private int hash(Key key)
    { return Math.abs(key.hashCode() % m); }


    public Value get(Key key)
    {
        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next)
            if (key.equals(x.key))
                return (Value) x.val;
        return null;
    }
    public void put(Key key, Value val)
    {
        int i = hash(key);
        for (Node x = lists[i]; x != null; x = x.next)
        {
            if (key.equals(x.key))
            {
                x.val = val;
                return;
            }
        }
        lists[i] = new Node(key, val, lists[i]);
    }

}
