/**
 * Summary:
 * Time Complexity: O(n) where n is the number of tasks.
 * Space Complexity: O(1) since we only use a constant amount of space aside from the input.
 */

public class SimpleTaskScheduler {


  private static void processTasks(int[] tasks) {
    int taskTime = 0;

    for (int time : tasks) {
      taskTime += time;
      System.out.println("Task completed at: " + taskTime);
    }
  }

  // Main function to execute the program
  public static void main(String[] args) {
    // Example task durations
    int[] tasks = {4, 2, 5, 3};

    // Process and print the results
    processTasks(tasks);
  }
}
