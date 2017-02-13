package AmazonOA2_Feb10;

public class Test{
	public static void main(String[] args){
		ListNode head=new ListNode(0);
		ListNode temp=head;
		for(int i=1;i<7;i++){
			temp.next=new ListNode(i);
			temp=temp.next;
		}
		print(reverseSecondHalfList(head));


	}

	public static ListNode reverseSecondHalfList(ListNode head) {
		if (head == null || head.next == null)
		return head;
		ListNode fast = head;
		ListNode slow = head;
		while (fast.next != null && fast.next.next != null) {
		fast = fast.next.next;
		slow = slow.next;
		}
		ListNode pre = slow.next;
		ListNode cur = pre.next;
		while (cur != null) {
		pre.next = cur.next;
		cur.next = slow.next;
		slow.next = cur;
		cur = pre.next;
		}
		return head;
	}

	public static void print(ListNode head){
		while(head!=null){
			System.out.print(head.val+" ");
			head=head.next;
		}
	}
}

/*
class ListNode{
	int val;
	ListNode next;
	ListNode(int val){
		this.val=val;
	}
}*/
