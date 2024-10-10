package com.om;
import java.util.Arrays;

public class sortedmatrix { // Capitalized class name to follow Java conventions
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.toString(search(arr, 37)));
    }

    // search in the row provided between the col provided
    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) { // Corrected spelling of method name
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1}; // Added return statement for when target is not found
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length; // be cautious, matrix may be empty

        if (row == 1) {
            return binarySearch(matrix, 0, 0, col - 1, target);
        }

        // Incomplete logic here, must handle other cases

        return new int[]{-1, -1}; // Added return statement to avoid compilation error
    }
}
