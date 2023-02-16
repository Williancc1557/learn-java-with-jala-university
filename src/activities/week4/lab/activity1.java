package activities.week4.lab;
import java.util.Arrays;
import java.util.Scanner;


public class activity1 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    }


    public static double first(double n, double exp) {
        return Math.pow(n, exp);
    }

    public static double second(int a, int b, int c) {
        double delta = first(b, 2) - 4 * a * c;

        return delta;
    }
}
