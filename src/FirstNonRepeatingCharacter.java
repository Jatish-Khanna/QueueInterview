import java.util.LinkedList;
import java.util.Queue;

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
