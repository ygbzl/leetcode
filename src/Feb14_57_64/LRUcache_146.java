package Feb14_57_64;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by zhupd on 2/21/2017.
 */
public class LRUcache_146 {
    int capacity;
    int n=0;

    Map<Integer, DLinkedNode> cache = new HashMap<>();
    DLinkedNode head = new DLinkedNode();
    DLinkedNode tail = new DLinkedNode();


    public LRUcache_146(int capacity) {
        this.capacity=capacity;
        head.next=tail;
        tail.pre=head;
        head.pre = null;
        tail.next = null;
    }

    public int get(int key) {
        if (cache.containsKey(key)) {
            toHead(cache.get(key));
            return cache.get(key).val;
        } else {
            return -1;
        }


    }

    public void put(int key, int value) {
        if (cache.containsKey(key)) {
            DLinkedNode cur = cache.get(key);
            cur.val = value;
            toHead(cur);
        } else {
            DLinkedNode cur = new DLinkedNode();
            cur.val = value;
            cur.key = key;
            addToHead(cur);
            cache.put(key, cur);
            n++;
            if (n > capacity) {
                cache.remove(tail.pre.key);
                popTail();
                n--;
            }

        }

    }


    class DLinkedNode {
        int key;
        int val;
        DLinkedNode pre;
        DLinkedNode next;
    }

    void popTail() {
        /*DLinkedNode temp=tail.pre.pre;
        tail.pre=temp;
        temp.next=tail;*/
        DLinkedNode temp=tail.pre;
        DLinkedNode pp=temp.pre;
        pp.next=tail;
        tail.pre=pp;
    }

    void addToHead(DLinkedNode node) {
        node.next = head.next;
        head.next=node;
        node.pre=head;
        node.next.pre=node;
    }

    void toHead(DLinkedNode node) {
        node.pre.next = node.next;
        node.next.pre=node.pre;
        node.next = head.next;
        head.next=node;
        node.pre = head;
        node.next.pre=node;


    }
}
