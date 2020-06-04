package org.coding.linklist.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer,Integer> {

    private static final float DEFAULT_LOAD_FACTOR = 0.75f ;
    private int MAX_LENGTH;

    public LRUCache(int capacity) {
        super(capacity,DEFAULT_LOAD_FACTOR,true);
        this.MAX_LENGTH = capacity;
    }

    public int get(int key) {
        return (super.get(key) == null) ? -1 : super.get(key) ;
    }

    public void put(int key, int value) {
        super.put(key,value);

    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return super.size() > MAX_LENGTH;
    }

}
