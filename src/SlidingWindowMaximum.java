import java.util.Arrays;
import java.util.LinkedList;

/**
 * Time and Space Complexity Analysis:
 * Time Complexity:
 * Each index is added to the deque and removed at most once.
 * Therefore, the time complexity for processing the array is O(n),
 * where n is the length of the input array.
 * Space Complexity:
 * The space complexity is O(k),
 * where k is the size of the sliding window.
 * In the worst case, the deque will store up to k indices at any time.
 */
public class SlidingWindowMaximum {

  static LinkedList<Integer> window = new LinkedList<>();

  private static int[] maxSlidingWindow(int[] nums, int k) {
    if (k <= 1) {
      return nums;
    }
    int index = 0;
    while (index < k) {
      while (!window.isEmpty() && nums[window.peek()] < nums[index]) {
        window.pollLast();
      }
      window.offer(index);
      ++index;
    }
    int[] result = new int[nums.length - k + 1];
    while (index < nums.length) {
      result[index - k] = nums[window.peek()];

      if (window.peek() <= index - k) {
        window.poll();
      }

      while (!window.isEmpty() && nums[window.peek()] < nums[index]) {
        window.pollLast();
      }
      window.offer(index);
      ++index;
    }
    result[index - k] = nums[window.peek()];

    return result;
  }

  public static void main(String[] args) {
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    int[] result = maxSlidingWindow(nums, k);

    // Output the result
    System.out.println(Arrays.toString(result)); // Output: [3, 3, 5, 5, 6, 7]
  }
}
