package activities.week3.lab;

import java.util.Scanner;

public class Activity3 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // first();
        // second();
    }

    public static void first() {
        System.out.print("Digite um número de 0 a 10: ");
        int option = scan.nextInt();

        switch (option) {
            case 0:
                System.out.println("Zero");
                break;
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Trẽs");
                break;
            case 4:
                System.out.println("Quatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;
            case 8:
                System.out.println("Oito");
                break;
            case 9:
                System.out.println("Nove");
                break;
            case 10:
                System.out.println("Dez");
                break;
            default:
                System.out.println("Opção Inválida!");
        }
    }

    public static void second() {
        while (true) {
            System.out.println("Digite uma das opcoes desejadas:");
            System.out.println("1. Somar dois numeros");
            System.out.println("2. Subtrair dois numeros");
            System.out.println("3. Multiplicar dois numeros");
            System.out.println("4. Dividir dois numeros");
            System.out.println("5. SAIR");

            int optionInput = scan.nextInt();

            double number1 = 0;
            double number2 = 0;

            if (optionInput == 5) break;

            System.out.print("Digite o valor de x: ");
            number1 = scan.nextInt();
            System.out.print("Digite o valor de y: ");
            number2 = scan.nextInt();

            switch (optionInput) {
                case 1:
                    System.out.println(number1 + number2);
                    break;
                case 2:
                    System.out.println(number1 - number2);
                    break;
                case 3:
                    System.out.println(number1 * number2);
                    break;
                case 4:
                    System.out.println(number1 / number2);
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
