package MidLevelAlgoritham;


public class MidLevelAlgoritham {


  
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 1, 4};
        int[] arr2 = {1, 2, 3, 4};
        
        System.out.println(updateMEX(4, arr1)); 
        System.out.println(updateMEX(4, arr2)); 
    }

    public static int updateMEX(int num, int[] arr) {
        boolean[] present = new boolean[num + 1];

        // Mark elements present in arr
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= num) {
                present[arr[i]] = true;
                // System.out.println( " present =="+present[arr[i]]); 
            }
        }

        // Find the MEX value
        int MEX = 0;
        for (int i = 0; i <= num; i++) {
            if (!present[i]) {
                MEX = i;
                break;
            }
        }

        // If MEX is 0, then it's not possible to change it
        if (MEX == 0) {
            return -1;
        }

        // Check if there is any element <= MEX in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= MEX) {
                return 1;
            }
        }

        // If no such element found, return -1
        return -1;
    }
}