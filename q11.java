import java.util.Scanner;

/**
 * Write a description of class q11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q11
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your annual income in NPR:");
        double income=scan.nextDouble();
        double tax=0;
        if (income<=500000) 
        {
            tax=income*1/100;
        } 
        else if(income<=700000) 
        {
            tax=5000+(income-500000)*10/100;  
        } 
        else if (income<=1000000) 
        {
            tax=15000+(income-700000)*20/100;  
        } 
        else if (income <= 2000000) 
        {
            tax=35000+(income-1000000)*30/100;  
        } 
        else if (income <= 5000000) 
        {
            tax=335000+(income-2000000)*36/100; 
        } 
        else 
        {
            tax = 1135000+(income-5000000)*39/100; 
        }
        System.out.println("Your Income: Rs. " + income);
        System.out.println("Total Tax Payable: Rs. " + tax);
    }
}
    