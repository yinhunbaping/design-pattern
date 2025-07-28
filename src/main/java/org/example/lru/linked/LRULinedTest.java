package org.example.lru.linked;

public class LRULinedTest {

    public static void main(String[] args) {

        LRUCacheLinked<Integer, String> lruCacheLinked = new LRUCacheLinked<>(3);
        lruCacheLinked.put(1, "中国");
        lruCacheLinked.put(2, "美国");
        lruCacheLinked.put(3, "英国");
        System.out.println("初始值:" + lruCacheLinked.keySet());

        // 访问一次元素，观察元素位置
        lruCacheLinked.get(1);
        System.out.println("访问一次key=1后:" + lruCacheLinked.keySet());

        // 添加元素, 观察元素位置
        lruCacheLinked.put(4, "俄罗斯");
        System.out.println("达到容量上限后, 添加一个新的元素后:" + lruCacheLinked.keySet());
    }
}
