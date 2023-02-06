package activities.week3;

import java.util.Arrays;
import java.util.Scanner;

public class Activity2 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // first();
        // second();
        // third();
        // fourth();
    }

    public static double[][] getMatrix(int column, int line) {
        double[][] matrix = new double[line][column];

        for (int l = 0; l < line; l++) {
            for (int c = 0; c < column; c++) {
                System.out.print("Type an number " + l + "|" + c + " : ");
                matrix[l][c] = scan.nextDouble();
            }
        }

        return matrix;
    }

    public static void first() {
        int COLUMN = 3;
        int LINE = 3;

        double[][] matrix = getMatrix(COLUMN, LINE);

        double MAX_VALUE = 0;
        int COLUMN_MAX_VALUE = 0;
        int LINE_MAX_VALUE = 0;

        for (int l = 0; l < LINE; l++) {
            for (int c = 0; c < COLUMN; c++) {
                double value = matrix[l][c];
                if (value > MAX_VALUE) {
                    MAX_VALUE = value;
                    COLUMN_MAX_VALUE = c;
                    LINE_MAX_VALUE = l;
                }
            }
        }

        for (double line[] : matrix) {
            System.out.println(Arrays.toString(line));
        }

        System.out.println("Column: " + (COLUMN_MAX_VALUE + 1));
        System.out.println("Line: " + (LINE_MAX_VALUE + 1));
    }

    public static void second() {
        int COLUMN = 5;
        int LINE = 5;

        double[][] matrix = new double[COLUMN][LINE];

        for (int i = 0; i < matrix.length; i++) {
            if (i < COLUMN && i < LINE) matrix[i][i] = 1;
        }

        for (double line[] : matrix) {
            System.out.println(Arrays.toString(line));
        }
    }

    public static void third() {
        int COLUMN = 6;
        int LINE = 6;

        double[][] matrix = getMatrix(COLUMN, LINE);

        int moreThanTenCounter = 0;
        for (int l = 0; l < LINE; l++) {
            for (int c = 0; c < COLUMN; c++) {
                if (matrix[c][l] > 10) moreThanTenCounter++;
            }
        }

        System.out.println(moreThanTenCounter + " is greater than 10");
    }

    public static void fourth() {
        int COLUMN = 4;
        int LINE = 4;

        double[][] matrix = getMatrix(COLUMN, LINE);

        int evenCounter = 0;
        for (int l = 0; l < LINE; l++) {
            for (int c = 0; c < COLUMN; c++) {
                if (matrix[c][l] % 2 == 0) evenCounter++;
            }
        }

        System.out.println("Even numbers quantity is " + evenCounter);
    }

    public static  void fifth() {
        int COLUMN = 3;
        int LINE = 3;

        double[][] matrix = getMatrix(COLUMN, LINE);

        System.out.print("Type an value of the matrix: ");
        double value = scan.nextDouble();

        boolean hasNumber = false;
        int COLUMN_VALUE = 0;
        int LINE_VALUE = 0;

        for (int l = 0; l < LINE; l++) {
            for (int c = 0; c < COLUMN; c++) {
                if (matrix[l][c] == value) {
                    COLUMN_VALUE = c;
                    LINE_VALUE = l;
                    hasNumber = true;
                }
            }

            if (hasNumber) break;
        }

        if (!hasNumber) {
            System.out.println("Number not found");
            return;
        };

        for (double line[] : matrix) {
            System.out.println(Arrays.toString(line));
        }

        System.out.println("line: " + LINE_VALUE);
        System.out.println("Column: " + COLUMN_VALUE);
    }
}
