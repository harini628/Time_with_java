public class DynamicStack {
	int capacity = 2;
	int[] stack = new int[capacity];
	int top = 0;
	public void push(int data) {
		if(top == stack.length) {
			extend();
		}
		stack[top] = data;
		top++;
	}
	public void extend() {
		int stack_length = size();
		capacity = capacity*2;
		int[] new_stack = new int[capacity];
		for(int i=0;i<stack_length;i++) {
			new_stack[i] = stack[i];
		}
		stack = new_stack;
	}
	public void pop() {
		if(isEmpty()) {
			System.out.println("STACK IS EMPTY : STACK UNDERFLOW ERROR....!");
		}else {
		top--;
		System.out.println("Deleted element: "+stack[top]);
		stack[top] = 0;
		shrink();
		}
	}
	
	public void shrink() {
		if(size() <= (capacity/2) ) {
			capacity = capacity/2;
		}
		int[] new_stack = new int[capacity];
		for(int i=0;i<capacity;i++) {
			new_stack[i]=stack[i];
		}
		stack = new_stack;
	}
	
	public boolean isEmpty() {
		return top<=0;
	}
	
	public int size() {
		return top;
	}
	public void display() {
		for(int i=0;i<stack.length;i++) {
			System.out.print(stack[i]+" ");
		}
		System.out.println();
	}
}
