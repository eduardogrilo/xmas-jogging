import java.math.*;

public class XmasBoloReiJogging {
    
    public static void reverse(int[] array) {
               
        int i = 0, j = array.length - 1, tmp=0;
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

        if (calories.length < 1 || calories.length > 40){
            return -1;
        }


        for (int index = 0; index < calories.length; index++){
            if (calories[index] <1 || calories [index] > 1000) {
                return -1;
            }
            sum += (long) Math.pow(2, index) * calories[index];
        }
        return(sum);
    }
    public static void main(String[] args) {
        //int calories[] = {5 , 7 , 10};
        int calories[] = {56,4};
        System.out.println(getMinimumDistance(calories));
    }
}
