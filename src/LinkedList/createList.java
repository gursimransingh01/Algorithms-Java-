package LinkedList;

public class createList {
	
	private static class ListNode {
		int data;
		ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {
			//10 --> 8 --> 5 --> 1 --> null
		//initially all the data will be pointed to NULL. They must be connected together
		
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(8);
		ListNode third = new ListNode(5);
		ListNode tail = new ListNode(1);
		
		//Link all of them
		
		head.next = second;
		second.next = third;
		third.next = tail;
		tail.next = null;
		
		display(head);
	}
	
	
	static void display(ListNode head){
		
		//printing nodes of LinkedList
		
		ListNode current = head;
		
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}

	}

}
