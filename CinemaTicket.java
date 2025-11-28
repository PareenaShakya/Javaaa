import java.util.Scanner;

/**
 * Write a description of class CinemaTicket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CinemaTicket
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your age group (child/adult/senior):");
        String ageGroup = scan.next().toLowerCase();
        System.out.print("Enter movie language (nepali/hindi/english):");
        String language = scan.next().toLowerCase();
        System.out.print("Are you a student? (yes/no):");
        String isStudent = scan.next().toLowerCase();
        System.out.print("Is it a festival day? (yes/no):");
        String isFestival = scan.next().toLowerCase();
        double basePrice = 0;
        if(ageGroup.equals("child")) 
        {
            basePrice = 150;
        } 
        else if(ageGroup.equals("adult")) 
        {
            basePrice = 250;
        } 
        else if(ageGroup.equals("senior")) 
        {
            basePrice = 200;
        } 
        else 
        {
            System.out.println("Invalid age group!");
        }
        if(language.equals("hindi"))
        {
            basePrice+=50;
        } 
        else if(language.equals("english")) 
        {
            basePrice+=100;
        } 
        else if(!language.equals("nepali")) 
        {
            System.out.println("Invalid movie language!");
        }
        double finalPrice=basePrice;
        if(isStudent.equals("yes")) 
        {
            finalPrice-=finalPrice*20/100;
        }
        if(isFestival.equals("yes")) 
        {
            finalPrice-=finalPrice*15/100;
        }
        System.out.println("Base Price: Rs. " + basePrice);
        System.out.println("Final Ticket Price: Rs. " + finalPrice);
    }
}
