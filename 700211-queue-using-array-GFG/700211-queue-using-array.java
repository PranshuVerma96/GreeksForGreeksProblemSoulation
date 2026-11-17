class myQueue {
	
	// Constructor
	int[] arr;
	int front;
	int rear;
	int size;
	int capacity;
	
	public myQueue(int n) {
		// Define Data Structures
		arr = new int[n];
		capacity = n;
		size = 0;
		front = 0;
		rear = -1;
	}
	
	public boolean isEmpty() {
		// Check if queue is empty
		if (size == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean isFull() {
		// Check if queue is full
		return size == capacity;
		
	}
	
	public void enqueue(int x) {
		if (isFull())
			return;
		
		rear = (rear + 1) % capacity;
		arr[rear] = x;
		size++;
	}
	
	public void dequeue() {
		if (isEmpty())
			return;
		
		front = (front + 1) % capacity;
		size--;
	}
	
	public int getFront() {
		// Get front element
		if (isEmpty()) {
			return - 1;
		}
		else {
			return arr[front];
		}
	}
	
	public int getRear() {
		// Get last element
		if (isEmpty()) {
			return - 1;
		}
		else {
			return arr[rear];
		}
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna