package activities.week4.lab;

import java.util.Arrays;
import java.util.Scanner;

public class question3 {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println(determinante());
    }

    public static double determinante() {
        System.out.print("Type the colum and line of matrix: ");
        int matrixSizeInput = scan.nextInt();
        int[][] matrix = getMatrix(matrixSizeInput);

        int diagonalSumIndo = getDiagonalsIndo(matrix, matrixSizeInput);
        int diagonalSumVoltando = getDiagonalsVoltando(matrix, matrixSizeInput);

        System.out.println(diagonalSumIndo);
        System.out.println(diagonalSumVoltando);


        return diagonalSumIndo - diagonalSumVoltando;
    }

    public static int[][] getMatrix(int matrixSizeInput) {
        int[][] matrix =  new int[matrixSizeInput][(matrixSizeInput * 2) - 1];
        int[][] matrixToShows = new int[matrixSizeInput][matrixSizeInput];

        for (int l = 0; l < matrixSizeInput; l++) {
            for (int c = 0; c < matrixSizeInput; c++) {
                System.out.print("Type an number " + l + "|" + c + " : ");
                int value = scan.nextInt();
                matrix[l][c] = value;
                matrixToShows[l][c] = value;
            }
        }

        showMatrix(matrixToShows);

        return getMatrixWithAdditionalValues(matrix, matrixSizeInput - 1);
    }

    public static void showMatrix(int [][] matrix) {
        for (int[] line : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static int[][] getMatrixWithAdditionalValues(int[][] matrix, int additionalLength) {
        for (int l = 0; l < matrix.length; l++) {
            for (int c = 0; c < additionalLength; c++) {
                matrix[l][c + matrix.length] = matrix[l][c];
            }
        }

        return matrix;
    }
    public static int getDiagonalsIndo(int[][] matrix, int diagonalLength) {
        int diagonalsIndoSum = 0;

        int state = 0;
        int diagonal = 0;
        for (int column = 0; column < matrix.length + matrix.length; column++) {
            diagonalsIndoSum += matrix[diagonal][column];
            if (diagonal == diagonalLength - 1) {
                state++;
                column = state - 1;
                diagonal = 0;

                if (state == 3) break;
            }
            else diagonal++;
        }


        return diagonalsIndoSum;
    }

    public static int getDiagonalsVoltando(int[][] matrix, int diagonalLength) {
        int diagonalsIndoSum = 0;

        int state = matrix.length + matrix.length - 2;
        int diagonal = 0;
        for (int column = matrix.length + matrix.length - 2; column >= 0; column--) {
            diagonalsIndoSum += matrix[diagonal][column];
            if (diagonal == diagonalLength - 1) {
                state--;
                if (state == 0 || column <= 0) break;
                column = state + 1;
                diagonal = 0;

            }
            else diagonal++;
        }


        return diagonalsIndoSum;
    }
}
