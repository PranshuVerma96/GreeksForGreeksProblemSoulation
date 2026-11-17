import java.util.*;

class MyQueue {

    Deque<Integer> queue;

    public MyQueue() {
        queue = new ArrayDeque<>();
    }

    public void enqueue(int x) {
        queue.offerLast(x);
    }

    public void dequeue() {
        if (!queue.isEmpty()) {
            queue.pollFirst();
        }
    }

    public int getFront() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peekFirst();
    }

    public int getRear() {
        if (queue.isEmpty()) {
            return -1;
        }
        return queue.peekLast();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna