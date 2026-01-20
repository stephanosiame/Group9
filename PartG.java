/*
Array method to use in manipulation 
*/
import java.util.Arrays;

public class PartG {
    public static void main(String[] args) {

        int[] numbers = {5, 2, 9, 1, 7};

        // 1. sort() - Sorts the array in ascending order
        Arrays.sort(numbers);

        // 2. toString() - Converts array to readable string
        System.out.println(Arrays.toString(numbers));

        // 3. binarySearch() - Searches for an element in sorted array
        int index = Arrays.binarySearch(numbers, 7);

        // 4. fill() - Fills array with a specific value
        Arrays.fill(numbers, 3);

        // 5. equals() - Compares two arrays for equality
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        System.out.println(Arrays.equals(a, b));

        // 6. copyOf() - Copies array with new length
        int[] copy = Arrays.copyOf(a, 5);

        // 7. copyOfRange() - Copies a range of elements
        int[] range = Arrays.copyOfRange(a, 0, 2);

        // 8. hashCode() - Returns hash code of array
        System.out.println(Arrays.hashCode(a));

        // 9. deepToString() - Prints multidimensional arrays
        int[][] matrix = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepToString(matrix));

        // 10. deepEquals() - Compares multidimensional arrays
        int[][] mult1 = {{1, 2}};
        int[][] mult2 = {{1, 2}};
        System.out.println(Arrays.deepEquals(mult1, mult2));
    }
}
