/*
This is the question that is use datatype called string to store data in tex form in the 2D array
*/

public class PartC {
    public static void main(String[] args) {

        // Create a 2D String array
        String[][] students = {
            {"Alice", "Bob"},
            {"Carol", "David"}
        };

        // 1. Print "Bob"
        System.out.println("Value of Matrix (0,1)");
        System.out.println(students[0][1]);

        System.out.println();

        // 2. Replace "Carol" with "Eve"
        students[1][0] = "Eve";

        // 3. Print all names manually
        System.out.println("All value including replaced value in matrix (1,0) from Calor to Eve");
        System.out.println(students[0][0]);
        System.out.println(students[0][1]);
        System.out.println(students[1][0] + " <=== Value that changed");
        System.out.println(students[1][1]);
    }
}
