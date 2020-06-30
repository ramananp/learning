package io.ramanan.learning.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {
    /** Initialize your data structure here. */
    private Map<Integer, Integer> values;
    private Map<Integer, Integer> indices;
    public InsertDeleteGetRandom() {
        values = new HashMap<>();
        indices = new HashMap<>();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(values.containsKey(val)) {
            return false;
        }
        values.put(val, values.size());
        indices.put(indices.size(), val);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(!values.containsKey(val)) {
            return false;
        }
        int index = values.get(val);
        values.remove(val);
        indices.remove(index);
        int tail = indices.get(indices.size());
        indices.put(index, tail);
        values.put(tail, index);
        return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        if(values.isEmpty()) {
            return -1;
        }
        if(values.size() == 1) {
            return indices.get(0);
        }
        Random random = new Random();
        int nextRandom = random.nextInt(values.size());
        return indices.get(nextRandom);
    }

    public static void main(String[] args) {
        // Init an empty set.
        InsertDeleteGetRandom randomSet = new InsertDeleteGetRandom();

        // Inserts 1 to the set. Returns true as 1 was inserted successfully.
        randomSet.insert(1);

        // Returns false as 2 does not exist in the set.
        randomSet.remove(2);

        // Inserts 2 to the set, returns true. Set now contains [1,2].
        randomSet.insert(2);

        // getRandom should return either 1 or 2 randomly.
        randomSet.getRandom();

        // Removes 1 from the set, returns true. Set now contains [2].
        randomSet.remove(1);

        // 2 was already in the set, so return false.
        randomSet.insert(2);

        // Since 2 is the only number in the set, getRandom always return 2.
        randomSet.getRandom();
    }
}