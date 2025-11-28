import java.util.Scanner;

/**
 * Write a description of class workshop4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class workshop4
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter obtained marks:");
        int marks=scan.nextInt();
        if(marks>=20)
        {
            System.out.println("Pass");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}