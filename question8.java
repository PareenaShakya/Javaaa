import java.util.Scanner;

/**
 * Write a description of class question8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question8
{
    public static void main(String[] args)
    {
     Scanner scan=new Scanner(System.in);
     double gpa;
     String grade;
     System.out.print("Enter GPA (0.0 to 4.0): ");
     gpa = scan.nextDouble();
     if (gpa < 0.0 || gpa > 4.0) 
     {
            System.out.println("Invalid GPA! Please enter a value between 0.0 and 4.0");

    }
     if (gpa >= 3.6) {
            grade = "A";
            } 
      else if (gpa >= 3.0) {
            grade = "B";
            } 
     else if (gpa >= 2.0) {
            grade = "C";
            } 
      else if (gpa >= 1.0) {
            grade = "D";
            } 
     else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);

    }

}
