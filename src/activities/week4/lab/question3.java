package activities.week4.lab;

import java.util.Arrays;
import java.util.Scanner;

public class question3 {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        int[][] matrix = getMatrix(3);

        System.out.print("Determinante: ");
        System.out.println(determinante(matrix));

        System.out.print("Simétrico: ");
        System.out.println(checkSymmetry(matrix, 3, 3));
    }

    public static double determinante(int[][] matrix) {
        int diagonalSumIndo = getDiagonalsIndo(matrix, 3);
        int diagonalSumVoltando = getDiagonalsVoltando(matrix, 3);


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
        int diagonalMultiplication = 1;

        for (int column = 0; column < matrix.length + matrix.length; column++) {
            diagonalMultiplication *= matrix[diagonal][column];
            if (diagonal == diagonalLength - 1) {
                diagonalsIndoSum += diagonalMultiplication;
                diagonalMultiplication = 1;
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
        int diagonalMultiplication = 1;
        for (int column = matrix.length + matrix.length - 2; column >= 0; column--) {
            diagonalMultiplication *= matrix[diagonal][column];
            if (diagonal == diagonalLength - 1) {
                diagonalsIndoSum += diagonalMultiplication;
                diagonalMultiplication = 1;
                state--;
                if (state == 0 || column <= 0) break;
                column = state + 1;
                diagonal = 0;
            }
            else diagonal++;
        }


        return diagonalsIndoSum;
    }

    public static boolean checkSymmetry(int matrix[][], int line, int column) {
        for (int l = 0; l < line; l++) {
            for (int c = 0; c < column; c++) {
                boolean withoutSymmetry = matrix[l][c] != matrix[c][l];

                if (withoutSymmetry) return false;
            }
        }

        return true;
    }
}
