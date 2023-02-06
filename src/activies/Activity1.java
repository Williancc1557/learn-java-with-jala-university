package activies;

import java.util.Arrays;
import java.util.Scanner;

public class Activity1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // first();
        // second();
        // third();
        // fourth();
    }

    public static double[] getArray(int lenght) {
        double[] numbers = new double[lenght];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Type an number " + "(" + (i + 1) + "/" + lenght + "): ");
            numbers[i] = scan.nextDouble();
        }

        return numbers;
    }

    public static void first() {
        double[] numbers = getArray(12);

        System.out.println("Type two numbers: ");
        int[] positions = {scan.nextInt(), scan.nextInt()};

        for (int position : positions) {
            if (position < 1 || position > 12) {
                System.out.println("Invalid position");
                return;
            }
        }

        System.out.println(numbers[positions[0] - 1] + numbers[positions[1] - 1]);
    }

    public static void second() {
        double[] numbers = getArray(10);

        for (double number : numbers) {
            if (number % 2 == 1) {
                System.out.println("The number " + number + " is odd");
            }
        }
    }

    public static void third() {
        int LENGTH = 16;
        double[] numbers = getArray(LENGTH);

        double[] invertedNumbers = new double[LENGTH];
        for (int i = 0; i < LENGTH; i++) {
            if (i < 8) invertedNumbers[i] = numbers[i + (LENGTH / 2) ];
            else invertedNumbers[i] = numbers[Math.abs(i - (LENGTH / 2))];
        }

        System.out.println(Arrays.toString(invertedNumbers));
    }

    public static void fourth() {
        int LENGTH = 20;
        double[] numbers = getArray(LENGTH);

        System.out.print("Type number to find: ");
        int numberInput = scan.nextInt();

        boolean isFound = false;
        for (int i = 0; i < LENGTH; i++) {
            if (numberInput == numbers[i]) {
                System.out.println("The position is " + (i + 1));
                isFound = true;
            }
        }

        if (!isFound) System.out.println("Number not found");
    }
}
