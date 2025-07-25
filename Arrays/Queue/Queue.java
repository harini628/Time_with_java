public class Queue {
	static int[] queue = new int[5];
	static int front;
	static int rear;
	static int size;
	
	
	public static void enqueue(int data) {
		if(!isFull()) {
		queue[rear] = data;
		rear = (rear+1)%5;
		//rear++;rear = rear%5;
		size++;
		}
		else {
			System.out.println("QUEUE IS FULL!!!");
		}
	}
  
	public static void dequeue() {
		if(!isEmpty()) {
		//front++;front = front%5;
		front = (front+1)%5;
		size--;
		}else {
			System.out.println("QUEUE IS EMPTY!!!");
		}
	}
  
	public static void display() {
		System.out.print("Elements of queue: ");
		for(int i=0;i<size;i++) {
			System.out.print(queue[(front+i)%5] + " ");
		}
		System.out.println();
		System.out.print("Elements of array: ");
		for(int n:queue) {
			System.out.print(n + " ");
		}
		System.out.println();
		System.out.println();
	}
  
	public static int getsize() {
		return size;
	}
  
	public static boolean isFull() {
		return getsize() == 5;
	}
  
	public static boolean isEmpty() {
		return getsize() == 0;
	}
  
}
