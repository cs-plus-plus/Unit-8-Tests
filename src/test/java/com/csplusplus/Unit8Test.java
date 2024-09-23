package com.csplusplus;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Unit8Test {

    // 1. Test for sumOfElements (15 points)
    @Test
    public void testSumOfElements() {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };  // 3x3
        int[][] array2 = { {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1}, {1, 1, 1, 1, 1} };  // 5x5
        int[][] array3 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24} };  // 6x4

        assertEquals(45, Unit8.sumOfElements(array1));  // 3x3 sum = 45
        assertEquals(25, Unit8.sumOfElements(array2));  // 5x5 sum = 25
        assertEquals(300, Unit8.sumOfElements(array3));  // 6x4 sum = 300
    }

    // 2. Test for countOccurrences (15 points)
    @Test
    public void testCountOccurrences() {
        int[][] array1 = { {1, 2, 3}, {4, 2, 2}, {7, 8, 9} };  // 3x3
        int[][] array2 = { {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5}, {5, 5, 5, 5, 5} };  // 5x5
        int[][] array3 = { {1, 2, 3, 2}, {2, 6, 2, 8}, {9, 2, 11, 12}, {13, 2, 15, 16}, {17, 2, 19, 20}, {21, 2, 23, 2} };  // 6x4

        assertEquals(3, Unit8.countOccurrences(array1, 2));  // 3x3: 2 appears 3 times
        assertEquals(25, Unit8.countOccurrences(array2, 5));  // 5x5: 5 appears 25 times
        assertEquals(9, Unit8.countOccurrences(array3, 2));  // 6x4: 2 appears 9 times
    }

    // 3. Test for findMax (15 points)
    @Test
    public void testFindMax() {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };  // 3x3
        int[][] array2 = { {10, 20, 30, 40, 50}, {60, 70, 80, 90, 100}, {110, 120, 130, 140, 150}, {160, 170, 180, 190, 200}, {210, 220, 230, 240, 250} };  // 5x5
        int[][] array3 = { {-10, -20, -30, -40}, {-50, -60, -70, -80}, {-90, -100, -110, -120}, {-130, -140, -150, -160}, {-170, -180, -190, -200}, {-210, -220, -230, -240} };  // 6x4

        assertEquals(9, Unit8.findMax(array1));  // Max is 9 in 3x3 array
        assertEquals(250, Unit8.findMax(array2));  // Max is 250 in 5x5 array
        assertEquals(-10, Unit8.findMax(array3));  // Max is -10 in 6x4 array
    }

    // 4. Test for reverseRows (15 points)
    @Test
    public void testReverseRows() {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };  // 3x3
        Unit8.reverseRows(array1);
        assertArrayEquals(new int[][] { {7, 8, 9}, {4, 5, 6}, {1, 2, 3} }, array1);  // 3x3 reversed

        int[][] array2 = { {1, 1, 1, 1, 1}, {2, 2, 2, 2, 2}, {3, 3, 3, 3, 3}, {4, 4, 4, 4, 4}, {5, 5, 5, 5, 5} };  // 5x5
        Unit8.reverseRows(array2);
        assertArrayEquals(new int[][] { {5, 5, 5, 5, 5}, {4, 4, 4, 4, 4}, {3, 3, 3, 3, 3}, {2, 2, 2, 2, 2}, {1, 1, 1, 1, 1} }, array2);  // 5x5 reversed

        int[][] array3 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24} };  // 6x4
        Unit8.reverseRows(array3);
        assertArrayEquals(new int[][] { {21, 22, 23, 24}, {17, 18, 19, 20}, {13, 14, 15, 16}, {9, 10, 11, 12}, {5, 6, 7, 8}, {1, 2, 3, 4} }, array3);  // 6x4 reversed
    }

    // 5. Test for transpose (20 points)
    @Test
    public void testTranspose() {
        int[][] array1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };  // 3x3
        int[][] transposed1 = Unit8.transpose(array1);
        assertArrayEquals(new int[][] { {1, 4, 7}, {2, 5, 8}, {3, 6, 9} }, transposed1);  // 3x3 transposed

        int[][] array2 = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25} };  // 5x5
        int[][] transposed2 = Unit8.transpose(array2);
        assertArrayEquals(new int[][] { {1, 6, 11, 16, 21}, {2, 7, 12, 17, 22}, {3, 8, 13, 18, 23}, {4, 9, 14, 19, 24}, {5, 10, 15, 20, 25} }, transposed2);  // 5x5 transposed

        int[][] array3 = { {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24} };  // 6x4
        int[][] transposed3 = Unit8.transpose(array3);
        assertArrayEquals(new int[][] { {1, 5, 9, 13, 17, 21}, {2, 6, 10, 14, 18, 22}, {3, 7, 11, 15, 19, 23}, {4, 8, 12, 16, 20, 24} }, transposed3);  // 6x4 transposed
    }

    // 6. Test for fillWithRandom (20 points)
    @Test
    public void testFillWithRandom() {
        int min = 1, max = 5, numRows = 3, numCols = 3;
        int[][] randomArray = Unit8.fillWithRandom(min, max, numRows, numCols);
        
        // Verify the size of the array
        assertEquals(numRows, randomArray.length);
        assertEquals(numCols, randomArray[0].length);

        // Check that all elements are within the range [min, max]
        for (int[] row : randomArray) {
            for (int value : row) {
                assertTrue(value >= min && value <= max);  // Verify that the value is in the specified range
            }
        }
    }
}
