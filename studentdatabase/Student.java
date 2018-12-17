package studentdatabase;

import java.util.Scanner;

public class Student {
  private String firstName;
  private String lastName;
  private int gradeYear;
  private String studentId;
  private String courses = "";
  private int tuition = 0;
  private static int costOfCourse = 600;
  private static int id = 1000;

  //Constructor: prompt to enter student's name and year
  public Student() {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter student first name: ");
    this.firstName = in.nextLine();

    System.out.print("Enter student last name: ");
    this.lastName = in.nextLine();

    System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
    this.gradeYear = in.nextInt();

    setStudentID();
  }

  //Generate unique id
  private void setStudentID() {
    //Grade level + ID
    id++;
    this.studentId = gradeYear + "" + id;
  }

  //Enroll in course
  public void enroll() {
    //Get inside loop, user hit q to quit
    do {
      System.out.print("Enter course to enroll (q to quit): ");
      Scanner in = new Scanner(System.in);
      String course = in.nextLine();

      if(!course.equals("q")) {
        courses = courses + "\n  " + course;
        tuition += costOfCourse;
      } else {
        break;
      }
    } while(1 != 0);
  }

  //View Balance
  public void viewBalance() {
    System.out.println("Your balance is " + tuition);
  }

  //Pay Tuition
  public void payTuition() {
    viewBalance();
    Scanner in = new Scanner(System.in);
    System.out.print("Enter payment amount: $");
    int payment = in.nextInt();

    tuition -= payment;
    System.out.println("Thank you for your payment of $" + payment);
    viewBalance();
  }

  //Show status
  public String showInfo() {
    return "Name: " + firstName + " " + lastName +
           "\nStudent ID: " + studentId +
           "\nGrade Level: " + gradeYear +
           "\nCourses Enrolled: " + courses +
           "\nBalance: " + tuition;
  }
}
