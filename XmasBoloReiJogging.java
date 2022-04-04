import java.math.*;

public class XmasBoloReiJogging {
    
    public static void reverse(int[] array) {
        
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        int tmp;

        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
}
    public static long getMinimumDistance(int[] calories) {
        
        reverse(calories);
        long sum = 0;
        for (int index = 0; index < calories.length; index++){
            sum = sum + (long) Math.pow(2, index) + calories[index];
        }
        return(sum);
        //return -1;


    }
    public static void main(String[] args) {
        int calories[] = {5 , 7 ,10 };
        System.out.println(getMinimumDistance(calories));
    }
}
