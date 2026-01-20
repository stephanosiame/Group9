/*
Question two in Part be is onother conscept to the dimension array and how is working in arrange the obje 
row and column is the concept for acessing the index or position in memory which value is settled
*/

public class PartB {
    public static void main(String[] args) {

        // Create a 2D array (2 rows, 3 columns) because value in two Dimension consist two of one D
        int[][] matrix = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // 1. Print element at row 0, column 1
        System.out.println(matrix[0][1]); // 20 output

        // 2. Print element at row 1, column 2
        System.out.println(matrix[1][2]); // 60 output

        // 3. Change 20 to 25
        matrix[0][1] = 25;

        // 4. Print all elements manually with its index
        System.out.println(matrix[0][0]);
        System.out.println(matrix[0][1]);
        System.out.println(matrix[0][2]);
        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);
        System.out.println(matrix[1][2]);
    }
}
