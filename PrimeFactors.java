/**
* Comilation: javac PrimeFactors.java
* Execution: java PrimeFactors

/**
 * @author adesh varma
 *version: 1.0
 * status: 14- 08-2017
 */
package com.util;
import java.util.Scanner;
class PrimeFactors
{
		static int number,temp; // static varialble declaration
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in); //creating the Scanner class object
		System.out.print("Enter a Number : ");
		number=sc.nextInt(); // Accepting i/p from the user

		System.out.print("The Prime Factors of "+number+" are : ");
		// Logic to find the Prime factor of A number ex: prime factor of 10 :2,5
		int temp=2;
		while(number>1)
		{
			if(number%temp == 0)
			{
				System.out.print(temp+" ");
				number=number/temp;
			}
			else
			temp++;
		}
	}
}
