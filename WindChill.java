/**
* Comilation: javac LeapYear.java 
* Execution: java LeapYear

/**
 * @author adesh varma
 *version: 1.0
 * status: 14- 08-2017
 */
import java.util.Scanner;

public class LeapYear 
{

		static int year; // static  variable declaration
	public static void main(String[] args)
	{
		System.out.println("Enter the year you want to check");
		Scanner sc=new Scanner(System.in); // Creating the object of Scanner class
		 year=sc.nextInt();  // Accepting i/p from the user;
		if(year>1562)
		{
			if(year%4==0 && year%4==0)
			{
				System.out.println("this year is leap year:"+year);
			}
		}
		else {System.out.println("this is not a leap year");}
	}

}
