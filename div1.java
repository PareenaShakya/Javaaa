import java.util.Scanner;

/**
 * Write a description of class div1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class div1
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num %3==0)
        {
            if (num%5==0)
            {
            System.out.println("Divisible by 3 & 5");
        }
        else 
        {
            System.out.println("Divisible by 3 but not by 5");
        }
    }
    else if(num %5==0)
    {
      System.out.println("Divisible by 5 but not 3");  
    }
    else
    {
        System.out.println("Not divisible by both 3 & 5");
    }
}
}