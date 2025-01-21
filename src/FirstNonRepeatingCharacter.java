public class FirstNonRepeatingCharacter {

  public static void main(String[] args) {
    FirstNonRepeatingCharacter stream = new FirstNonRepeatingCharacter();
    stream.insert('a');
    stream.insert('b');
    stream.insert('a');
    System.out.println(stream.getFirstNonRepeating()); // Output: 'b'
    stream.insert('c');
    System.out.println(stream.getFirstNonRepeating()); // Output: 'b'
  }
}
