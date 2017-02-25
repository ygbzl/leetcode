package Feb23_81_88;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.
 * Created by zhupd on 2/23/2017.
 */
public class MergeKsortedLists_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        PriorityQueue<ListNode> pq=new PriorityQueue<>(lists.length,new Comparator<ListNode>(){
            public int compare(ListNode o1,ListNode o2) {
                if(o1.val>o2.val) return 1;
                else if(o1.val==o2.val) return 0;
                else  return -1;
            }
        });
        for (ListNode x : lists) {
            if (x != null) {
                pq.offer(x);
            }

        }
        ListNode head = new ListNode(0);
        ListNode cur = head;
        while (!pq.isEmpty()) {
            cur.next = pq.poll();
            cur = cur.next;
            if (cur.next != null) {
                pq.offer(cur.next);
            }
        }
        return head.next;



    }
   /*     return partion(lists, 0, lists.length-1);
    }

    ListNode partion(ListNode[] list, int a, int b) {
        if(a==b) return list[a];
        if (a < b) {
           // int mid = a + (b - a) / 2;
            int mid = (a + b) / 2;
            ListNode left = partion(list, a, mid);
            ListNode right = partion(list, mid + 1, b);
            return merge2list(left, right);
        } else return null;

    }

    ListNode merge2list(ListNode a, ListNode b) {
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        if (a.val > b.val) {
            b.next = merge2list(a, b.next);
            return b;
        } else {
            a.next = merge2list(a.next, b);
            return a;
        }
    }*/
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}