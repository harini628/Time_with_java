public class LinkedList {
	
	Node head;
	
	public void insertlast(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if( head == null) {
			head = node;
		}else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
	}
	
	public void insertfirst(int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		if(head == null) {
			head = node;
		}else {
			node.next = head;
			head = node;
			
		}
	}
	
	public void insertAt(int index,int data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		
		Node n = head;
		if(index==0) {
			insertfirst(data);
			/*node.next = head;
			head = node;
			*/
		}
		else {
		for(int i=1;i<index;i++) {
			n = n.next;
		}
		node.next = n.next;
		n.next = node;
		}
		
	}
	
	public void deleteIndex(int index) {
		Node n = head;
		Node x = head.next;
		
		if(index == 0) {
			head = head.next;
		}
		else {
			
		for(int i=1;i<index;i++) {
			n = n.next;
			x = n.next;
		}
		n.next = x.next;
		}
		
	}
	
	public void display() {
		Node n = head;
		while(n.next!=null) {
			System.out.print(n.data + "-> ");
			n = n.next;
		}
		System.out.print(n.data + "-> Null ");
	}
}
