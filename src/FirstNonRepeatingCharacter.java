import java.util.LinkedList;
import java.util.Queue;

/**
 * Summary of Complexity:
 * Time Complexity:
 * <p>
 * insert(char newChar): O(1)
 * getFirstNonRepeating(): O(n) (in the worst case, where n is the number of characters in the queue)
 * Space Complexity:
 * <p>
 * O(n), where n is the number of characters in the queue.
 * The frequency array uses O(1) space since its size is fixed (256 for ASCII characters).
 */
public class FirstNonRepeatingCharacter {

  int[] data;
  Queue<Character> dataQueue;

  FirstNonRepeatingCharacter() {
    data = new int[256];
    dataQueue = new LinkedList<>();
  }

  private char getFirstNonRepeating() {
    while (!dataQueue.isEmpty() && data[dataQueue.peek()] > 1) {
      dataQueue.poll();
    }
    return dataQueue.isEmpty() ? '#' : dataQueue.peek();
  }

  private void insert(char newChar) {
    dataQueue.offer(newChar);
    data[newChar]++;
  }

  public static void main(String[] args) {
    FirstNonRepeatingCharacter stream = new FirstNonRepeatingCharacter();
    stream.insert('a');
    stream.insert('b');
    stream.insert('a');
    System.out.println(stream.getFirstNonRepeating()); // Output: 'b'
    stream.insert('c');
    System.out.println(stream.getFirstNonRepeating()); // Output: 'b'
    stream.insert('b');
    stream.insert('a');
    System.out.println(stream.getFirstNonRepeating()); // Output: 'b'
    stream.insert('d');
    System.out.println(stream.getFirstNonRepeating()); // Output: 'b'
  }
}
