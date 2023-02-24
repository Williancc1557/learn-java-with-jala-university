package activities.week5.lab;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Type your registration: ");
        student.setName(scan.nextLine());

        System.out.print("Type your name: ");
        student.setName(scan.nextLine());

        System.out.print("Type your address");
        student.setAddress(scan.nextLine());

        System.out.print("Type your email: ");
        student.setEmail(scan.nextLine());

        System.out.println("Type your 3 grades: ");
        double[] grades = {Double.parseDouble(scan.nextLine()), Double.parseDouble(scan.nextLine()), Double.parseDouble(scan.nextLine())};
        student.setGrades(grades);

        System.out.print("Type your course: ");
        student.setCourse(scan.nextLine());

        System.out.print("Type your phone: ");
        student.setPhone(scan.nextLine());

        System.out.print("Type your absences quantity: ");
        student.setAbsencesNumber(scan.nextInt());

        String approvedText = "approved: " + student.isApproved();
        String examText = "exam: " + student.willTakeExam();
        String reprovedText = "reproved: " + student.isReproved();

        System.out.println(approvedText);
        System.out.println(examText);
        System.out.println(reprovedText);
    }
}
