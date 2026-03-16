# Unit 8: 2D Array

AP Computer Science A

## Overview

This project covers **Unit 8: 2D Array** concepts including 2D array declaration, nested loop traversal, row/column operations, and common algorithms. Implement the 6 methods in `Unit8.java` and run the provided JUnit tests to verify your work.

## Getting Started

### Option 1: GitHub Codespaces (Recommended)

1. Click the green **Code** button on this repository
2. Select the **Codespaces** tab
3. Click **Create codespace on main**
4. Wait for the environment to build (~2 minutes the first time)
5. Start coding in `src/main/java/com/csplusplus/Unit8.java`

> **Note:** If the Java extension shows errors on first load, press `Cmd+Shift+P` (Mac) or `Ctrl+Shift+P` (Windows) and run **"Developer: Reload Window"**. This is a one-time setup step.

### Option 2: Local Development

1. Accept the assignment via the GitHub Classroom link
2. Clone the repository using GitHub Desktop
3. Open the project in your IDE (VS Code, IntelliJ, or Eclipse)
4. **Requirements:** Java 17+, Maven 3.x

## Running Tests

### In VS Code / Codespaces

Click the green play button next to any test method in `Unit8Test.java`, or open the **Testing** sidebar (beaker icon).

### Command Line

Run all tests:
```
mvn test
```

Run a single method's tests:
```
mvn -Dtest=Unit8Test#testSumOfElements test
```

## Scoring

| # | Method | Points | Concepts |
|---|--------|--------|----------|
| 1 | `sumOfElements(int[][])` | 15 | Nested loops, accumulator |
| 2 | `countOccurrences(int[][], int)` | 15 | Nested traversal, counting |
| 3 | `findMax(int[][])` | 15 | Nested traversal, tracking max |
| 4 | `reverseRows(int[][])` | 15 | Row swapping |
| 5 | `transpose(int[][])` | 20 | New array creation, row/column swap |
| 6 | `fillWithRandom(int, int, int, int)` | 20 | Array creation, `Math.random()` |
| | **Total** | **100** | |

## Common Mistakes

- Using `array.length` for columns instead of `array[0].length`
- Confusing row and column indices in nested loops
- Initializing max to 0 instead of `array[0][0]` (fails with all-negative arrays)
- Forgetting that transpose changes dimensions (2x4 becomes 4x2)
- Off-by-one errors in the random range formula

## Autograding

Your code is automatically graded when you push to GitHub. Check the **Actions** tab to see your score. Each method is tested independently — you earn points for each method you complete correctly.

## Contact

For questions, contact [kevin@csplusplus.com](mailto:kevin@csplusplus.com)
