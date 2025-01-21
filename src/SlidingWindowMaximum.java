import java.util.Arrays;

public class SlidingWindowMaximum {

  public static void main(String[] args) {
    int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
    int k = 3;
    int[] result = maxSlidingWindow(nums, k);

    // Output the result
    System.out.println(Arrays.toString(result)); // Output: [3, 3, 5, 5, 6, 7]
  }
}
