/**
* Comilation: javac LeapYear.java 
* Execution: java LeapYear

/**
 * @author adesh varma
 *version: 1.0
 * status: 14- 08-2017
 */
pacakge com.util;
import java.util.Scanner;
public class prime
{
	static int flag=0,number,ctr=0; //static variable declration 
	public static void main(String ...args)
	{
		System.out.println("ENter the number you want to check");
		Scanner sc=new Scanner(System.in); // creating object of Scanner class
		int number1=sc.nextInt();  // Asking user to Enter the value 
		for(number=1;number<=number1;number++)
		{	
				if	(number<=2)
				{	
					System.out.println(number);
				}
			else
			{
					for(i=2;i<number;i++)
			
					{
						if(number%i==0)
						{
						flag=0;
						break;	
						}
			
			
						else	
						{ 
							flag=1;
						}
					}
			
						if(flag==1)
						{	
							System.out.println(number);
						}			
			}
		}
	}
}
