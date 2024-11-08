package Interview.Student_Database_Application;

import java.util.Scanner;

public class Student_Database_Application {
    public static void main(String[] args) {
        // Ask How many user we want to add
        System.out.println("Enter Number of New Students to enroll: ");
        Scanner sc = new Scanner(System.in);
        int numOfStudents = sc.nextInt();
        Student[] students = new Student[numOfStudents];

        // Create n number of new students
        for (int n = 0; n < numOfStudents; n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
            System.out.println(students[n].toString());
        }
    }
}
