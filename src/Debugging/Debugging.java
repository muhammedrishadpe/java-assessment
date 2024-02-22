package Debugging;
import java.util.Arrays;

public class Debugging {
    public static int[] calc_mov_avg(int size, int[] vect, int window_size) {
        int n = size - window_size + 1; 
        int[] result = new int[n]; 
       
        // Loop through the input vector to calculate moving averages
        for (int i = 0; i < n; i++) {
            int sum = 0;
          
            // Calculate sum of elements within the current window
            for (int j = i; j < i + window_size; j++) {
                sum += vect[j];
            
            }
            // Calculate the average and round to the nearest integer
            result[i] = Math.round((float) sum / window_size);
            System.out.println("result = " + result[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int size = 4;
        int[] vect = {1, 2, 3, 4};
        int window_size = 3;
        int[] result = calc_mov_avg(size, vect, window_size);
        System.out.println("n = " + result.length);
        System.out.println("result = " + Arrays.toString(result));      
    }
}
