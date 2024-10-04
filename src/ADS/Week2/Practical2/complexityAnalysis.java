package ADS.Week2.Practical2;

/**
 * This class contains the methods included in Practical 4 - Activity 1
 * While the source code is identical, the formatting of each method has
 * been adjusted so that each line of code corresponds to a single operation.
 *
 * @author Ilias Tachmazidis
 * @version September 2024
 */
public class complexityAnalysis {

    /**
     * Returns the sum of the integers in given array.
     */
    public static int example1(int[] arr) {
        int n = arr.length, total = 0;  // 2
        for (int j = 0; // 1
             j < n; // 1
             j++) {        // loop from 0 to n-1

            total += arr[j]; // 1
        }
        return total; // 1
    }

    /**
     * Returns the sum of the integers with even index in given array.
     */
    public static int example2(int[] arr) {
        int n = arr.length, total = 0;
        for (int j = 0;
             j < n;
             j += 2) {   // note the increment of 2

            total += arr[j];
        }
        return total;
    }

    /**
     * Returns the sum of the prefix sums of given array.
     */
    public static int example3(int[] arr) {
        int n = arr.length, total = 0;
        for (int j = 0;
             j < n;
             j++) {       // loop from 0 to n-1

            for (int k = 0;
                 k <= j;
                 k++) {   // loop from 0 to j

                total += arr[k];
            }
        }
        return total;
    }

    /**
     * Returns the sum of the prefix sums of given array.
     */
    public static int example4(int[] arr) {
        int n = arr.length, prefix = 0, total = 0;
        for (int j = 0;
             j < n;
             j++) {        // loop from 0 to n-1

            prefix += arr[j];
            total += prefix;
        }
        return total;
    }

    /**
     * Returns the number of times second array stores sum of prefix sums from first.
     */
    public static int example5(int[] first, int[] second) { // assume equal-length arrays
        int n = first.length, count = 0;
        for (int i = 0;
             i < n;
             i++) {        // loop from 0 to n-1

            int total = 0;

            for (int j = 0;
                 j < n;
                 j++) {   // loop from 0 to n-1

                for (int k = 0;
                     k <= j;
                     k++) {   // loop from 0 to j

                    total += first[k];
                }
            }

            if (second[i] == total) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] array2 = {35, 10, 20, 35, 15};
        System.out.println("example1: " + example1(array));
        System.out.println("example2: " + example2(array));
        System.out.println("example3: " + example3(array));
        System.out.println("example4: " + example4(array));
        System.out.println("example5: " + example5(array, array2));
    }
}
