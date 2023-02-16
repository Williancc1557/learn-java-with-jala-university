package activities.week4.lab;
import java.util.Scanner;


public class activity1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        fourth();
    }


    public static double first(double n, double exp) {
        return Math.pow(n, exp);
    }

    public static double second(int a, int b, int c) {
        double delta = first(b, 2) - 4 * a * c;

        return delta;
    }

    public static void third() {
        // I did it in question3 file in this directory
    }


    public static void recursiveFibonacci(int n, int total, int counter, int limit) {
        int sum = (n - counter) + total;
        System.out.println(sum);
        if (limit == counter) return;

        counter++;
        recursiveFibonacci(n, sum, counter, limit);
    }
    public static void fourth() {
        System.out.print("Type the n: ");
        int n = scan.nextInt();

        System.out.print("Type the limit of repetitions: ");
        int repetitions = scan.nextInt();

        recursiveFibonacci(n, 0, 1, repetitions);
    }
}
