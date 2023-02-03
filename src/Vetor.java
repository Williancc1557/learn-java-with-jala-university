import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        double[] notas = new double[5];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Type note: ");
            notas[i] = scan.nextDouble();
        }

        System.out.print("Select an note number to delete: ");
        int select = scan.nextInt();


        for (int i = 0; i < notas.length; i++) {
            if (select == i) {
                notas[i] = notas[i+1];
            }
        } // whe need delete the note and organize to not get an void space [1,]
    }
}
