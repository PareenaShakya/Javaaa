import java.util.Scanner;

/**
 * Write a description of class no here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class no
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=scan.nextInt();
        if (num > 0){
            System.out.println("Positive");
        }
        else if(num == 0)
        {
            System.out.println("Zero");
        }
        else 
        {
            System.out.println("Negative");
        }
    }
}