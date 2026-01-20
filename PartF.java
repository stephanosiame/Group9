/*
The question six deal with 3D array and mostly cover the concept of cube side
*/
public class PartF {
    public static void main(String[] args) {

        // Create a 3D array (2x2x2)
        int[][][] cube = {
            {
                {1, 2},
                {3, 4}
            },
            {
                {5, 6},
                {0, 0}
            }
        };

        System.out.println("Value in (1,0,1)");
        // 1. Print element 6
        System.out.println(cube[1][0][1]);

        System.out.println();

        // 2. Change 4 to 40
        cube[0][1][1] = 40;
        
        // 3. Print first layer manually
        System.out.println("ALL VALUES");
        System.out.println(cube[0][0][0]);
        System.out.println(cube[0][0][1]);
        System.out.println(cube[0][1][0]);
        System.out.println(cube[0][1][1] + " <=== Value that is changed from 4 to 40");
    }
}
