import java.util.*;

class LockingTree {
    private Map<Integer, Integer> locked;
    private List<List<Integer>> child;
    private int[] parent;

    public LockingTree(int[] parent) {
        this.locked = new HashMap<>();
        this.parent = parent;
        int n = parent.length;

        this.child = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            child.add(new ArrayList<>());
        }

        for (int i = 1; i < n; i++) {
            child.get(parent[i]).add(i);
        }
    }

    public boolean lock(int num, int user) {
        if (locked.containsKey(num)) return false;
        locked.put(num, user);
        return true;
    }

    public boolean unlock(int num, int user) {
        if (!locked.containsKey(num)) return false;
        if (locked.get(num) != user) return false;
        locked.remove(num);
        return true;
    }

    public boolean upgrade(int num, int user) {
        if (locked.containsKey(num)) return false;
        if (!hasLockedDescendant(num)) return false;
        if (hasLockedAncestor(num)) return false;

        unlockAllDescendants(num);
        locked.put(num, user);
        return true;
    }

    private boolean hasLockedDescendant(int node) {
        for (int c : child.get(node)) {
            if (locked.containsKey(c)) return true;
            if (hasLockedDescendant(c)) return true;
        }
        return false;
    }

    private boolean hasLockedAncestor(int node) {
        int curr = parent[node];
        while (curr != -1) {
            if (locked.containsKey(curr)) return true;
            curr = parent[curr];
        }
        return false;
    }

    private void unlockAllDescendants(int node) {
        for (int c : child.get(node)) {
            if (locked.containsKey(c)) {
                locked.remove(c);
            }
            unlockAllDescendants(c);  // Recursive call
        }
    }
}
