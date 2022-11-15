public class LC_705_Design_HashSet {
    
    boolean [] mSet;
    
    public MyHashSet() {
        mSet = new boolean[1_000_001];
    }
    
    public void add(int key) {
        mSet[key] = true;
    }
    
    public void remove(int key) {
        mSet[key] = false;
    }
    
    public boolean contains(int key) {
        return mSet[key];
    }
}
