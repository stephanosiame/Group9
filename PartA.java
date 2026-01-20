/*
The question of the task one which is for the one dimanton array which used to demostrate the array and functionalit.
How to create and initialize array.
How to acess value on array
how to change the value on array
concept of indexing
 */

public class PartA {
    public static void main(String[] args) {

        // Create an integer array with 5 values
        int[] scores = {60, 70, 85, 90, 100};

        // 1. Print first, third, and last elements
        System.out.println("values of  first, third, and last elements ");
        System.out.println("The first element: " + scores[0]); // first element
        System.out.println("The Third element: " + scores[2]); // third element
        System.out.println("The Last element: " + scores[4]); // last element

        System.out.println();

        // 2. Change the second element to 80
        scores[1] = 80;

        // 3. Print all elements manually
        System.out.println("ALL VALUES IN ARRAY");
        System.out.println(scores[0]); // value one in index zero array
        System.out.println(scores[1]); // value two in index one array now is change to 80
        System.out.println(scores[2]); // value three in index two array 
        System.out.println(scores[3]); // value four in index three aray
        System.out.println(scores[4]); // value five in index four array
    }
}
