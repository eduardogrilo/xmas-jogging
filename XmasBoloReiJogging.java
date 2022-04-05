import java.util.Arrays;
import java.util.Collections;

public class XmasBoloReiJogging {

    // Change order from highest value to to lowest value (reverse order)
    public static void reverse(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    public static long getMinimumDistance(Integer[] calories) {

        long sum = 0;

        // Reverse order allows highst values to multiplicate 2^0, 2^1...
        // which decreases the final result (sum) to the lowest value possible
        // (that's the goal of the task)
        reverse(calories);

        if (calories.length < 1 || calories.length > 40) {
            return -1;
        }

        for (int index = 0; index < calories.length; index++) {
            if (calories[index] < 1 || calories[index] > 1000) {
                return -1;
            }
            // Main formula of the task
            sum += (long) Math.pow(2, index) * calories[index];
        }
        return (sum);
    }

    // Driver Code
    public static void main(String[] args) {
        Integer calories[] = new Integer[] { 5, 10, 7 };
        // Integer calories[] = new Integer[] {56, 45, 1, 565, 23};
        // Integer calories[] = new Integer[] {};
        // Integer calories[] = new Integer[] {1001};
        System.out.println(getMinimumDistance(calories));
    }
}