import java.util.Arrays;
import java.util.Collections;

public class XmasBoloReiJogging {

    public static void reverse(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    public static long getMinimumDistance(Integer[] calories) {

        long sum = 0;
        reverse(calories);

        if (calories.length < 1 || calories.length > 40) {
            return -1;
        }

        for (int index = 0; index < calories.length; index++) {
            if (calories[index] < 1 || calories[index] > 1000) {
                return -1;
            }
            sum += (long) Math.pow(2, index) * calories[index];
        }
        return (sum);
    }

    public static void main(String[] args) {
        Integer calories[] = new Integer[] { 5, 10, 7 };
        // Integer calories[] = new Integer[] {56, 45, 1, 565, 23};
        // Integer calories[] = new Integer[] {};
        // Integer calories[] = new Integer[] {1001};
        System.out.println(getMinimumDistance(calories));
    }
}
