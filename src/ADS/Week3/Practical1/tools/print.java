package ADS.Week3.Practical1.tools;

/**
 * Print values (actually construct Strings) in a human friendly fashion.
 *
 * @author Ilias Tachmazidis
 * @version September 2024
 */
public class print {

    /**
     * Construct a String for an array.  All elements will be shown in a small array, ellipsis will be used for larger
     * arrays.
     * @param array the array.
     * @param maxShow the maximum number of entries in the array to be included in the string before ellipsis is used.
     * @return a string (partially) representing the array.
     */
    public static String array(Integer[] array, int maxShow) {
        if (array == null) return "null";
        if (array.length == 0) return "[]";
        StringBuilder builder = new StringBuilder("[" + array[0]);
        int index = 1;
        while (index < maxShow && index < array.length) {
            builder.append("," + array[index++]);
        }
        if (array.length <= maxShow) {
            builder.append("]");
        } else {
            builder.append(",...]");
        }
        return builder.toString();
    }

    private final static int DEFAULT_ARRAY_SHOW_LENGTH = 5;

    /**
     * Construct a String for an array.  All elements will be shown in arrays with up to DEFAULT_ARRAY_SHOW_LENGTH
     * entries, ellipsis will be used for larger arrays.
     * @param array the array.
     * @return a string (partially) representing the array.
     */
    public static String array(Integer[] array) {
        return array(array,DEFAULT_ARRAY_SHOW_LENGTH);
    }
}
