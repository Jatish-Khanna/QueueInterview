public class CircularQueue {
  public static void main(String[] args) {
    CircularQueue queue = new CircularQueue(5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    System.out.println(queue.dequeue()); // Output: 1
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    System.out.println(queue.dequeue()); // Output: 2
  }
}