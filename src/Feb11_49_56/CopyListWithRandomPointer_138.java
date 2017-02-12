package Feb11_49_56;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhupd on 2/11/2017.
 */
public class CopyListWithRandomPointer_138 {
    public RandomListNode copyRandomList(RandomListNode head) {
        Map<RandomListNode, RandomListNode> map = new HashMap<>();
        RandomListNode cur = head;
        while (cur != null) {
            map.put(cur, new RandomListNode(cur.label));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }
}

class RandomListNode{
    int label;
    RandomListNode next, random;

    RandomListNode(int x) {
        this.label = x;
    }
}
