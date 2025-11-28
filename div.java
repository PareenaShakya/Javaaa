
/**
 * Write a description of class div here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class div
{
    public static void main(String[] args)
    {
        int num=15;
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
    else
    {
      System.out.println("Not divisible by both 3 & 5");  
    }
}
}