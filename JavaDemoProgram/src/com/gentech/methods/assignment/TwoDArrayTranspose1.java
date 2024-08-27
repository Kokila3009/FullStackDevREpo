package com.gentech.methods.assignment;

class TwoD {
    void TwoDArray(int a[][]) {
        int rows = a.length;
        int cols = a[0].length;
        int[][] b = new int[cols][rows];

      
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[j][i] = a[i][j];
            }
        }

       
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class TwoDArrayTranspose1 {
    public static void main(String[] args) {
        int a[][] = {
            {1, 2, 3},
            {33, 45, 56},
            {34, 23, 2}
        };
        TwoD ob = new TwoD();
        ob.TwoDArray(a);
    }
}
