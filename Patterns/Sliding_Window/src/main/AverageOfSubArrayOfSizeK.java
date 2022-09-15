import java.util.Arrays;

/**
 * @author Anderson on 13/09/2022
 *
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], k=5
 *
 * Find contiguous subarrays of size '5' in the given array:
 * 1. For the first 5 numbers (subarray from index 0-4), the average is: (1+3+2+6-1)/5 => 2.2
 * 2. The average of the next 5 numbers (subarray index 1-5) is: (3+2+6-1+4)/5 => 2.8
 * 3. For the next 5 numbers (subarray from index 2-6), the average is: (2+6-1+4+1)/5 => 2.4
 *  ...
 */
public class AverageOfSubArrayOfSizeK {
    public static double[] findAverages(int k, int[] arr) {
        double[] result = new double[arr.length - k + 1];
        for (int i = 0; i <= arr.length - k; i++) {
            // find sum of next 'k' elements
            double sum = 0;
            for (int j = i; j < i + k; j++) {
                sum += arr[j];
            }
            result[i] = sum/k;
        }
        return result;
    }

    public static void main(String[] args) {
        double[] result = AverageOfSubArrayOfSizeK.findAverages(5, new int[] {1, 3, 2, 6, -1, 4, 1, 8, 2});
        System.out.println("Averages of subarrays of size k: " + Arrays.toString(result));
    }
}
