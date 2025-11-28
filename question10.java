import java.util.Scanner;

/**
 * Write a description of class question10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question10
{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String size;
        System.out.print("Enter paper size (A0 to A5): ");
        size = scan.next().toUpperCase();
        switch (size) {
            case "A0":
                System.out.println("Dimensions:");
                System.out.println("841 × 1189 mm");
                System.out.println("33.1 × 46.8 inches");
                break;
            case "A1":
                System.out.println("Dimensions:");
                System.out.println("594 × 841 mm");
                System.out.println("23.4 × 33.1 inches");
                break;
            case "A2":
                System.out.println("Dimensions:");
                System.out.println("420 × 594 mm");
                System.out.println("16.5 × 23.4 inches");
                break;
            case "A3":
                System.out.println("Dimensions:");
                System.out.println("297 × 420 mm");
                System.out.println("11.7 × 16.5 inches");
                break;
            case "A4":
                System.out.println("Dimensions:");
                System.out.println("210 × 297 mm");
                System.out.println("8.3 × 11.7 inches");
                break;
            case "A5":
                System.out.println("Dimensions:");
                System.out.println("148 × 210 mm");
                System.out.println("5.8 × 8.3 inches");
                break;
            default:
                System.out.println("Invalid paper size! Please enter between A0 and A5.");

        }

    }


}