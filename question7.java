import java.util.Scanner;

/**
 * Write a description of class question7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class question7
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        float mp;
        float sp;
        float discount=0;
        char category;
        System.out.println("Enter the marked price:");
        mp=scan.nextFloat();
        System.out.println("Enter the category A,B,C,D");
        category=scan.next().charAt(0);
        switch(Character.toUpperCase(category))
        {
            case 'A':
            discount=60;
            break;
            
            case 'B':
            discount=40;
            break;
            
            case 'C':
            discount=20;
            break;
            
            case 'D':
            discount=10;
            break;
            
            default:
            System.out.println("Invalid category");
        }
        sp=mp-(mp*discount/100);
        System.out.println("Selling price=" +sp);
    }
}