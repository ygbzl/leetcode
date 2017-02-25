package Feb22_65_72;

import java.util.*;

/**
 * Design a data structure that supports all following operations in average O(1) time.

 insert(val): Inserts an item val to the set if not already present.
 remove(val): Removes an item val from the set if present.
 getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
 * Created by zhupd on 2/23/2017.
 */
public class InsertDeleteGetRandomO1_380 {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();

    /** Initialize your data structure here. */
    public InsertDeleteGetRandomO1_380() {

    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }

        map.put(val, list.size());
        list.add(val);

        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        int index = map.get(val);
        int value = list.get(list.size() - 1);
        list.set(index, value);
        map.put(value,index );
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }
}



