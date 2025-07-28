package org.example.lru.linked;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU（Least Recently Used，最近最少使用)算法
 * <p>
 * 方式一： 基于LinkedHashMap实现, 极其简单的一种方式
 *
 * @author puying
 * @date 2025/07/28
 */
public class LRUCacheLinked<K, V> extends LinkedHashMap<K, V> {
    /**
     * 容量
     */
    private final int capacity;

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.size() > capacity;
    }


    public LRUCacheLinked(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }
}
