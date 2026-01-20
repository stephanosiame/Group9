public class PartD {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 25, 30},
            {40, 50, 60}
        };

        // 1. Number of rows
        System.out.println("No of length of 2D Array Matrix");
        System.out.println(matrix.length);

        System.out.println();

        // 2. Number of columns in first row
        System.out.println("Length of the First row is in index 0");
        System.out.println(matrix[0].length);

        System.out.println();

        // 3. Print last element using length
        System.out.println("Length to determin Element in (2,3)");
        System.out.println(matrix[matrix.length - 1][matrix[0].length - 1]);
    }
}
