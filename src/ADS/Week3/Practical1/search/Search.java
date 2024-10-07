package ADS.Week3.Practical1.search;

/**
 * Implements Sequential and Binary Search
 *
 * @author Ilias Tachmazidis
 * @version September 2024
 */
public class Search {

    /**
     * This method implements Sequential Search based on a given
     * value and array
     *
     * @param value An Integer value to search for
     * @param array An array of Integers
     * @return Index of the value within the array, -1 if not found
     */
    public static int sequentialSearch(Integer value, Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].compareTo(value) == 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     * This method implements Binary Search based on a given
     * value and array. Binary Search is called recursively
     * thus, bottom and top might be different in every call.
     *
     * @param bottom Current bottom within the array
     * @param top Current top within the array
     * @param value An Integer value to search for
     * @param array An array of Integers
     * @return Index of the value within the array, -1 if not found
     */
    public static int binarySearch(int bottom, int top, Integer value, Integer[] array) {
        if (bottom > top) {
            return -1;
        } else {
            int pivot = (bottom + top) / 2;
            if (value.compareTo(array[pivot]) == 0) {
                return pivot;
            } else if (value.compareTo(array[pivot]) < 0) {
                return binarySearch(bottom, pivot - 1, value, array);
            } else {
                return binarySearch(pivot + 1, top, value, array);
            }
        }
    }

    /**
     * This method searches for a value within a given array.
     * However, the search algorithm depends on the properties of
     * the array. More specifically, Binary Search is applied on
     * sorted arrays, while Sequential Search is applied on random
     * (not sorted) arrays.
     *
     * @param value An Integer value to search for
     * @param array An array of Integers
     * @return Index of the value within the array, -1 if not found
     */
    public static int search(Integer value, Integer[] array, String searchType) {
        for(int i = 0; i < array.length; i++) {
            if (array[i] > array[i++]);
                return(search(value, array, searchType = "sequential"));
        }
        return -1;
    }

    String Name = 0

    /**
     * Run search for a given array and value
     *
     * @param args (ignored)
     */
    public static void main(String[] args) {
        Integer value = 8;
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = -1;

        System.out.println("Searching value: " + value +
                "\n\tin array: " +  ADS.Week3.Practical1.tools.print.array(array, array.length));

        index = sequentialSearch(value, array);
        System.out.println("Sequential Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));

        index = binarySearch(0, array.length-1, value, array);
        System.out.println("Binary Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));

        index = search(value, array);
        System.out.println("Search: array[" + index + "] = " +
                (index >= 0? array[index]:"?"));
    }
}
