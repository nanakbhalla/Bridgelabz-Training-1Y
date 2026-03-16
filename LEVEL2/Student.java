import java.util.Scanner;

public class Student {
    String name;
    int rollNumber;
    int marks;
    char grade;

    char calcGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        System.out.print("Enter name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        s.rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        s.marks = sc.nextInt();

        s.grade = s.calcGrade();

        System.out.println("Name: " + s.name);
        System.out.println("Roll No: " + s.rollNumber);
        System.out.println("Marks: " + s.marks);
        System.out.println("Grade: " + s.grade);
    }
}
