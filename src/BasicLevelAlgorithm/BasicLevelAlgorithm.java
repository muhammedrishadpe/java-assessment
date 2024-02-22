package BasicLevelAlgorithm;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BasicLevelAlgorithm {
    public static int[] Cal(int[] arr, int n, int val) {
        int[] counts = new int[3]; // Array to store counts: smaller, equal, greater

        for (int i = 0; i < n; i++) {
            if (arr[i] < val) {
                counts[0]++; 
                
            } else if (arr[i] == val) {
                counts[1]++; 
            } else {
                counts[2]++; 
            }
        }

        return counts;
    }

    public static void main(String[] args) {
        int n = 5; 
        int val = 8; //input 
        int[] arr = {5, 7, 9, 18, 23}; 

        int[] result = Cal(arr, n, val);

        // Output the counts
        System.out.println("Count of integers smaller than " + val + ": " + Arrays.toString(result));

    }
}
