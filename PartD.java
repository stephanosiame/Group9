public class PartD {
    public static void main(String[] args) {

        int[][] matrix = {
            {10, 25, 30},
            {40, 50, 60}
        };

        // 1. Number of rows
        System.out.println(matrix.length);

        // 2. Number of columns in first row
        System.out.println(matrix[0].length);

        // 3. Print last element using length
        System.out.println(matrix[matrix.length - 1][matrix[0].length - 1]);
    }
}
