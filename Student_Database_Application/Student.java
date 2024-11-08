package Interview.Student_Database_Application;

import java.util.Scanner;

public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private String courses = "";
    private int tuitionBalance = 0;
    private int gradeYear;
    private static int costOFCourse = 600;
    private static int ID = 1000;

    // constructor prompt user to enter student's name and year
    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's First Name: ");
        this.firstName = sc.nextLine();

        System.out.println("Enter Student's Last Name: ");
        this.lastName = sc.nextLine();

        System.out.println("Enter the Student's class Level:\n1 - 1st Year\n2 - 2nd Year\n3 - 3rd Year\n4 - Final Year");
        this.gradeYear = sc.nextInt();

        setStudentID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    // Generate an ID
    private void setStudentID(){
        // Grade Level + ID
        ID++;
        this.studentID = gradeYear + "" + ID;
    }

    // Enroll in courses
    public void enroll(){
        // Get inside a loop, user hits 0
        do {
            System.out.print("Enter course to enroll (Q to Quit): ");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equalsIgnoreCase( "Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOFCourse;
            } else {
                break;
            }
        } while (true);

        System.out.println("ENROLLED IN: " + courses);
    }

    // View Balance
    public void viewBalance(){
        System.out.println("Your Balance is: $" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition(){
        viewBalance();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Payment: $");
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of $" + payment);
    }
    // Show Status
    public String toString(){
        return "Name: " + firstName + " " + lastName + "\nGrade Level: " + gradeYear + "\nStudentID: " + studentID + "\nCourse Enrolled: " + courses + "\nBalance: " + tuitionBalance;
    }
}
