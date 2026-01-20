public class PartE {
    public static void main(String[] args) {

        int[][] grid = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 1. Print center value
        System.out.println(grid[1][1]);

        // 2. Print four corners
        System.out.println(grid[0][0]);
        System.out.println(grid[0][2]);
        System.out.println(grid[2][0]);
        System.out.println(grid[2][2]);

        // 3. Change bottom-right value to 99
        grid[2][2] = 99;

        // 4. Print full grid manually
        System.out.println(grid[0][0]);
        System.out.println(grid[0][1]);
        System.out.println(grid[0][2]);
        System.out.println(grid[1][0]);
        System.out.println(grid[1][1]);
        System.out.println(grid[1][2]);
        System.out.println(grid[2][0]);
        System.out.println(grid[2][1]);
        System.out.println(grid[2][2]);
    }
}
