public class Run {

	public static void main(String[] args) {
		Queue qn = new Queue();
		
		qn.enqueue(10);
		qn.display();
		qn.enqueue(11);
		qn.display();
		qn.enqueue(12);
		qn.display();
		qn.enqueue(13);
		qn.display();
		qn.enqueue(14);
		qn.display();
		qn.enqueue(15);
		qn.display();
		
		qn.dequeue();
		qn.display();
		
		
	}

}
