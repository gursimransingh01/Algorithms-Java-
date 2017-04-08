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
		System.out.println("List is : ");
		display(head);
		//System.out.println("length of List is ");
		length(head);
	}
	
	
	static void display(ListNode head){
		
		//printing nodes of LinkedList
		
		ListNode current = head;
		
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}

	}
	
	static void length(ListNode head){
		//length of LinkedList
		
		int ctr=0;
		ListNode current = head;
		while(current != null){
			ctr = ctr+1;
			current = current.next;
		}
		System.out.println("Length of LinkedList " + ctr);
	}

}
