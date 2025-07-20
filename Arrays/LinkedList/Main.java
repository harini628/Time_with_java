public class Run {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insertlast(87);
		list.insertlast(66);
		list.insertlast(54);
		list.insertlast(99);
		list.insertfirst(97);
		list.insertAt(3, 88);
		list.deleteIndex(0);
		
		list.display();

	}

}
