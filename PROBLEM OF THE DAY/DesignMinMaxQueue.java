class SpecialQueue {

    // public SpecialQueue() {
    //     // Define Data Structures
    // }

    // public void enqueue(int x) {
    //     // Insert element into the queue
    // }

    // public void dequeue() {
    //     // Remove element from the queue
    // }

    // public int getFront() {
    //     // Get front element
    // }

    // public int getMin() {
    //     // Get minimum element
    // }

    // public int getMax() {
    //     // Get maximum element
         private Queue<Integer> queue;
    private Deque<Integer> minDeque;
    private Deque<Integer> maxDeque;

    public SpecialQueue() {
        queue = new LinkedList<>();
        minDeque = new LinkedList<>();
        maxDeque = new LinkedList<>();
    }

    public void enqueue(int x) {
        queue.offer(x);

       
        while (!minDeque.isEmpty() && minDeque.peekLast() > x) {
            minDeque.pollLast();
        }
        minDeque.offer(x);

      
        while (!maxDeque.isEmpty() && maxDeque.peekLast() < x) {
            maxDeque.pollLast();
        }
        maxDeque.offer(x);
    }

    public void dequeue() {
        int removed = queue.poll();
        if (removed == minDeque.peek()) {
            minDeque.poll();
        }
        if (removed == maxDeque.peek()) {
            maxDeque.poll();
        }
    }

    public int getFront() {
        return queue.peek();
    }

    public int getMin() {
        return minDeque.peek();
    }

    public int getMax() {
        return maxDeque.peek();
    }
}
