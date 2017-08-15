/**
* Comilation: javac SumOfDice.java
* Execution: java SumOfDice

/**
 * @author Adesh varma
 *version: 1.0
 * status: 14- 08-2017
 */
 pacakge com.util;
import java.util.Scanner;
public class SumOfDice
{	
	static int counter,sum,Number; // static variable declaration
	static double number1,number2;
	public static void main(String []args)
	{
			System.out.println("Enter number of times you want to roll die");
			Scanner s=new Scanner(System.in);
			Number=s.nextInt(); // accepting i/p from the user
			for(counter=1;counter<=Number;counter++)
			{
				number1=Math.random()*6+1;
				number2=Math.random()*6+1;
				sum=(int)(number1+number2); // type casting from double value to int 
				System.out.println("Sum of number for :"+counter+"  "+"is"+sum);
			
			}
			
			
			
	}
}