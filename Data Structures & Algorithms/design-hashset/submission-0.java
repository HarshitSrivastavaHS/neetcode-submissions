class MyHashSet {

    LinkedList<Integer>[] myHash;

    public MyHashSet() {
        myHash = new LinkedList[100];
    }
    
    private LinkedList<Integer> getLinkedList(int key) {
        int index = key % myHash.length;
        
        LinkedList<Integer> current = myHash[index];

        if (current == null) {
            current = myHash[index] = new LinkedList<>();
        }

        return current;
    }

    public void add(int key) {
        LinkedList<Integer> current = getLinkedList(key);

        if (contains(key)) {
            return;
        }

        current.add(key);
    }
    
    public void remove(int key) {
        LinkedList<Integer> current = getLinkedList(key);

        if (!contains(key)) {
            return; 
        }

        current.remove(new Integer(key));

    }
    
    public boolean contains(int key) {
        LinkedList<Integer> current = getLinkedList(key);

        return current.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */