package com.csplusplus;

public class Unit8 {

    public static void main(String[] args) {
        // Test your methods here by calling them and printing the results
        // Example: test sumOfElements
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("sumOfElements(3x3 grid) = " + sumOfElements(grid));  // Expected: 45
    }

    /**
     * Calculates the sum of all elements in a 2D array.
     *
     * <p>Points: 15</p>
     *
     * <p>Example: sumOfElements({{1,2,3},{4,5,6},{7,8,9}}) returns 45</p>
     *
     * <p>Hint: Use nested for loops. Outer loop for rows (array.length),
     * inner loop for columns (array[row].length).</p>
     *
     * @param array the 2D array
     * @return the sum of all elements
     */
    public static int sumOfElements(int[][] array) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Counts how many times a given value appears in a 2D array.
     *
     * <p>Points: 15</p>
     *
     * <p>Hint: Use nested loops to check every cell. If array[r][c] == value, increment count.</p>
     *
     * @param array the 2D array to search
     * @param value the value to count
     * @return the number of occurrences
     */
    public static int countOccurrences(int[][] array, int value) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Finds and returns the maximum element in a 2D array.
     *
     * <p>Points: 15</p>
     *
     * <p>Hint: Initialize max to array[0][0] (not 0!), then check every element.
     * This handles arrays with all negative numbers correctly.</p>
     *
     * @param array the 2D array (assumed non-empty)
     * @return the maximum element
     */
    public static int findMax(int[][] array) {
        // TODO: Implement this method
        return 0;
    }

    /**
     * Reverses the order of rows in the 2D array in place.
     * The first row swaps with the last row, etc.
     *
     * <p>Points: 15</p>
     *
     * <p>Hint: Swap entire row references from both ends moving inward.
     * temp = array[top]; array[top] = array[bottom]; array[bottom] = temp;</p>
     *
     * @param array the 2D array to modify
     */
    public static void reverseRows(int[][] array) {
        // TODO: Implement this method
    }

    /**
     * Returns a new 2D array that is the transpose of the input.
     * Rows become columns and columns become rows.
     *
     * <p>Points: 20</p>
     *
     * <p>Hint: Create a new array with dimensions [cols][rows].
     * Then: result[c][r] = array[r][c] for all r and c.</p>
     *
     * @param array the original 2D array
     * @return a new transposed 2D array
     */
    public static int[][] transpose(int[][] array) {
        // TODO: Implement this method
        return null;
    }

    /**
     * Creates a 2D array filled with random integers in the range [min, max] (inclusive).
     *
     * <p>Points: 20</p>
     *
     * <p>Hint: Create new int[numRows][numCols]. Fill each cell with:
     * (int)(Math.random() * (max - min + 1)) + min</p>
     *
     * @param min the minimum random value (inclusive)
     * @param max the maximum random value (inclusive)
     * @param numRows number of rows
     * @param numCols number of columns
     * @return a 2D array filled with random values
     */
    public static int[][] fillWithRandom(int min, int max, int numRows, int numCols) {
        // TODO: Implement this method
        return null;
    }
}
