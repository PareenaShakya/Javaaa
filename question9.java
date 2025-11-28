import java.util.Scanner;

/**
 * Write a description of class question9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question9
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter GPA: ");
        double gpa = scan.nextDouble();
        System.out.print("Enter attendance percentage: ");
        double attendance = scan.nextDouble();
        System.out.print("Enter attitude score (1–10): ");
        int attitude = scan.nextInt();
        if (gpa >= 3.2) {

            if (attendance > 80) {
                if (attitude < 5) {
                    System.out.println("The student is eligible for a scholarship.");
                } 
                else 
                {
                    System.out.println("Not eligible: Poor attitude score.");
                }
            } 
            else 
            {
                System.out.println("Not eligible: Attendance too low.");
            }
        } 
        else {
            System.out.println("Not eligible: GPA too low.");
        }
    }
}
