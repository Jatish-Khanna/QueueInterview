/**
 * Enqueue Time Complexity: O(1)
 * Dequeue Time Complexity: O(1)
 * Space Complexity: O(n),
 * where n is the capacity of the queue (i.e., the number of elements it can hold).
 */
public class CircularQueue {

  int[] data;
  int size;
  int write;
  int read;
  int capacity;

  CircularQueue(int capacity) {
    data = new int[capacity];
    this.capacity = capacity;
    write = 0;
    read = 0;
    size = 0;
  }

  private int dequeue() {
    if (size == 0) {
      System.out.println("Queue is empty.");
      return -1;
    }
    int value = data[read];
    read = (read + 1) % capacity;
    --size;
    return value;
  }

  private void enqueue(int value) {
    if (size == capacity) {
      read = (read + 1) % capacity;
    } else {
      ++size;
    }
    data[write] = value;
    write = (write + 1) % capacity;

  }

  public static void main(String[] args) {
    CircularQueue queue = new CircularQueue(5);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    System.out.println(queue.dequeue()); // Output: 1
    queue.enqueue(4);
    queue.enqueue(5);
    queue.enqueue(6);
    queue.enqueue(6);
    queue.enqueue(6);
    System.out.println(queue.dequeue()); // Output: 2
  }
}