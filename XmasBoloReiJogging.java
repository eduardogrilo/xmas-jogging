import java.util.Arrays;

public class XmasBoloReiJogging {

    public static void reverse(int[] array) {
        Arrays.sort(array);
    }

    public static long getMinimumDistance(int[] calories) {

        reverse(calories);
        long sum = 0;

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
        int calories[] = {5, 10, 7};
        // int calories[] = {56,4};
        System.out.println(getMinimumDistance(calories));
    }
}
