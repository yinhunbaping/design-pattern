package org.example.lru.custom;

import lombok.Data;

/**
 * 双向链表节点
 *
 * @author puying
 * @date 2025/07/28
 */
@Data
public class DoubleLinkedNode {
    /**
     * 键
     */
    public int key;

    /**
     * 值
     */
    public int value;

    /**
     * 上一个节点
     */
    public DoubleLinkedNode prev;

    /**
     * 下一个节点
     */
    public DoubleLinkedNode next;
}
