# CS++ Java — Unit 8: 2D Arrays

> **Unit 8** | 100 Points | 6 Autograded Tests

In this assignment you will work with 2D arrays using nested loops. You will traverse, count, find maximums, reverse rows, transpose matrices, and fill arrays with random values.

---

## Table of Contents

1. [Concepts You Need](#concepts-you-need)
2. [Project Overview](#project-overview)
3. [Methods to Implement](#methods-to-implement)
4. [File Structure](#file-structure)
5. [Autograding](#autograding)
6. [Try It Yourself — Practice Examples](#try-it-yourself--practice-examples)
7. [Tips for Success](#tips-for-success)
8. [FAQ](#faq)

---

## Concepts You Need

### 2D Array Basics

A 2D array is an array of arrays — think of it as a grid with rows and columns:

```java
// Declare and initialize
int[][] grid = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Access elements: grid[row][col]
grid[0][0]    // 1 (top-left)
grid[1][2]    // 6 (row 1, col 2)
grid[2][1]    // 8 (row 2, col 1)

// Dimensions
grid.length        // 3 (number of rows)
grid[0].length     // 3 (number of columns)
```

### Traversing a 2D Array

Use nested loops — the outer loop iterates rows, the inner loop iterates columns:

```java
for (int row = 0; row < grid.length; row++) {
    for (int col = 0; col < grid[row].length; col++) {
        System.out.print(grid[row][col] + " ");
    }
    System.out.println();
}
```

### Creating a 2D Array

```java
// Create a 3x4 array (3 rows, 4 columns) filled with zeros
int[][] matrix = new int[3][4];

// Fill with values
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = row * 10 + col;
    }
}
```

### Transposing a Matrix

Transposing swaps rows and columns. Element at `[r][c]` moves to `[c][r]`:

```
Original:        Transposed:
1 2 3             1 4
4 5 6             2 5
                  3 6
```

For a matrix with `R` rows and `C` columns, the transpose has `C` rows and `R` columns.

### Random Numbers in a Range

```java
// Random int between min and max (inclusive)
int random = (int)(Math.random() * (max - min + 1)) + min;
```

---

## Project Overview

You will implement six static methods in `Unit8.java`. Each method works with `int[][]` 2D arrays.

---

## Methods to Implement

### 1. sumOfElements(int[][] array)
Return the sum of all elements in the 2D array.

```java
int[][] grid = {{1, 2}, {3, 4}};
sumOfElements(grid)    // returns 10
```

### 2. countOccurrences(int[][] array, int value)
Return how many times `value` appears in the 2D array.

```java
int[][] grid = {{1, 2, 3}, {2, 3, 2}, {1, 1, 2}};
countOccurrences(grid, 2)    // returns 4
countOccurrences(grid, 5)    // returns 0
```

### 3. findMax(int[][] array)
Return the largest element in the 2D array.

```java
int[][] grid = {{3, 7, 1}, {9, 2, 8}};
findMax(grid)    // returns 9
```

### 4. reverseRows(int[][] array)
Reverse the elements within each row. Modify the array in place.

```java
int[][] grid = {{1, 2, 3}, {4, 5, 6}};
reverseRows(grid);
// grid is now {{3, 2, 1}, {6, 5, 4}}
```

### 5. transpose(int[][] array)
Return a new 2D array that is the transpose of the input. The original rows become columns and vice versa.

```java
int[][] grid = {{1, 2, 3}, {4, 5, 6}};
int[][] result = transpose(grid);
// result is {{1, 4}, {2, 5}, {3, 6}}
```

### 6. fillWithRandom(int min, int max, int numRows, int numCols)
Create and return a new 2D array with the specified dimensions, filled with random integers between `min` and `max` (inclusive).

```java
int[][] grid = fillWithRandom(1, 10, 3, 4);
// Returns a 3x4 array where every element is between 1 and 10
```

---

## File Structure

```
Unit-8-Tests/
├── pom.xml                                      <-- Maven config (DO NOT MODIFY)
├── src/
│   ├── main/java/com/csplusplus/
│   │   └── Unit8.java                           <-- YOUR CODE GOES HERE
│   └── test/java/com/csplusplus/
│       └── Unit8Test.java                       <-- Tests (DO NOT MODIFY)
└── .github/
    └── workflows/
        └── classroom.yml                        <-- Autograding (DO NOT MODIFY)
```

**Edit only `Unit8.java`.**

---

## Autograding

| Test | What It Checks | Points |
|------|---------------|--------|
| testSumOfElements | Sums all elements in 2D array | 15 |
| testCountOccurrences | Counts target value across all rows/cols | 15 |
| testFindMax | Finds largest element | 15 |
| testReverseRows | Reverses each row in place | 15 |
| testTranspose | Rows become columns, correct dimensions | 20 |
| testFillWithRandom | Correct dimensions, values in range | 20 |

**Total: 100 points**

---

## Try It Yourself — Practice Examples

Create `Practice.java` in the same directory and run it with `javac Practice.java && java Practice`.

**Example 1 — Traversing and summing:**
```java
// Practice.java
public class Practice {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                sum += grid[row][col];
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
        System.out.println("Sum: " + sum);  // 45
    }
}
```

**Example 2 — Transposing:**
```java
// Practice.java
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[][] original = {{1, 2, 3}, {4, 5, 6}};
        int rows = original.length;
        int cols = original[0].length;

        // Transpose: new array has cols rows and rows cols
        int[][] transposed = new int[cols][rows];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                transposed[c][r] = original[r][c];
            }
        }

        System.out.println("Original (2x3):");
        for (int[] row : original) System.out.println(Arrays.toString(row));
        System.out.println("Transposed (3x2):");
        for (int[] row : transposed) System.out.println(Arrays.toString(row));
    }
}
```

**Example 3 — Reversing rows:**
```java
// Practice.java
import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};

        for (int row = 0; row < grid.length; row++) {
            for (int i = 0; i < grid[row].length / 2; i++) {
                int j = grid[row].length - 1 - i;
                int temp = grid[row][i];
                grid[row][i] = grid[row][j];
                grid[row][j] = temp;
            }
        }

        for (int[] row : grid) System.out.println(Arrays.toString(row));
        // [3, 2, 1]
        // [6, 5, 4]
    }
}
```

---

## Tips for Success

1. Always use `array.length` for rows and `array[row].length` for columns
2. For `transpose`, the new array dimensions are swapped: `new int[cols][rows]`
3. For `reverseRows`, swap elements within each row — do not reverse the row order
4. For `fillWithRandom`, the formula `(int)(Math.random() * (max - min + 1)) + min` gives a random int in [min, max]
5. For `findMax`, initialize to `array[0][0]`, not `0` (handles negative arrays)
6. Think of `array[row][col]` — outer index is always the row

---

## FAQ

**Q: What is the difference between `array.length` and `array[0].length`?**
`array.length` is the number of rows. `array[0].length` is the number of columns (the length of the first row).

**Q: For `reverseRows`, do I reverse the order of the rows or the elements within each row?**
Reverse the elements within each row. Row `{1, 2, 3}` becomes `{3, 2, 1}`. The rows stay in the same order.

**Q: For `transpose`, do I modify the original array?**
No. Create and return a new array. The original should remain unchanged.

**Q: How do I test `fillWithRandom`?**
The test checks that the returned array has the correct dimensions and that every element falls within `[min, max]`. Since values are random, it does not check specific numbers.

---

View all assignments and scoring breakdowns at [csplusplus.com/maven-tests](https://csplusplus.com/maven-tests)

*CS++ — AP Computer Science A — [csplusplus.com](https://csplusplus.com)*
