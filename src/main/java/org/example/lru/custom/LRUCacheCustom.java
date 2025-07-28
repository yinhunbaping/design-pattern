package org.example.lru.custom;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU（Least Recently Used，最近最少使用)算法
 * <p>
 * 方式二：手搓双向链表 + 哈希表自定义实现
 *
 * @author puying
 * @date 2025/07/28
 */
public class LRUCacheCustom<V, K> {
    /**
     * 大小
     */
    private int size;

    /**
     * 容量
     */
    private int capacity;

    /**
     * 头节点
     */
    private DoubleLinkedNode head;

    /**
     * 尾节点
     */
    private DoubleLinkedNode tail;

    /**
     * 哈希表, 缓存数据
     */
    private Map<V, K> cache;


    public LRUCacheCustom(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.head = new DoubleLinkedNode();
        this.tail = new DoubleLinkedNode();
        this.head.next= this.tail;
        this.tail.prev = this.head;
    }


    /**
     * 获取指定值
     *
     * @param key 键
     * @return {@link K }
     */
    public K get(V key) {


        return null;
    }

    /**
     * 添加指定键值对
     *
     * @param key   键
     * @param value 值
     */
    public void put(K key, V value) {

    }



}
