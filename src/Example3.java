import java.util.Scanner;
public class Example3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks : ");
        int marks = sc.nextInt();

        char grade;

        if (marks >= 80 && marks <= 100) {
            grade = 'A';
        }
        else if (marks >= 70) {
            grade = 'B';
        }
        else if (marks >= 60) {
            grade = 'C';
        }
        else if (marks >= 45) {
            grade = 'D';
        }
        else if (marks >= 0) {
            grade = 'F';
        }
        else {
            System.out.println("Invalid marks!");
            return;
        }
        switch (grade) {
            case 'A':
                System.out.println("Grade: A - Excellent");
                break;
            case 'B':
                System.out.println("Grade: B - Very Good");
                break;
            case 'C':
                System.out.println("Grade: C - Good");
                break;
            case 'D':
                System.out.println("Grade: D - Pass");
                break;
            case 'F':
                System.out.println("Grade: F - Fail");
                break;
        }
    }
}