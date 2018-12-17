package studentdatabase;

import java.util.Scanner;

public class StudentDataBase {

  public static void main(String[] args) {
    // Ask how many new users to add
    System.out.print("Enter number of students to enroll: ");
    Scanner in = new Scanner(System.in);
    int numOfStudents = in.nextInt();

    Student[] students = new Student[numOfStudents];

    //Create n number of new studentdatabase
    for(int n = 0; n < numOfStudents; n++) {
      students[n] = new Student();
      students[n].enroll();
      students[n].payTuition();
      students[n].showInfo();
    }
  }
}
