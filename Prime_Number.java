/**
* Comilation: javac Prime_Number.java 
* Execution: java Prime_Number

/**
 * @author adesh varma
 *version: 1.0
 * status: 14- 08-2017
 */
 //package com.utill;
import java.util.Scanner;

public class Prime_Number
{

		static int Number,Number1; // static  variable declaration
		static  int counter,counter1,ctr=0;

		public static void main(String[] args)
	{
			System.out.println("Enter the range of Numberr you want to check");
			Scanner sc=new Scanner(System.in); // Creating the object of Scanner class
			Number=sc.nextInt();  // Accepting i/p from the user;
			for(Number1=1;Number1<=Number;Number1++)
				{
						int c=Number1;
					System.out.println("***");
					for(counter1=2;counter1<=c/2;counter1++)
						{
							if((Number)%counter1==0);
							{
								
								ctr++;
							}
							
						
						if(ctr<=1)
							{
								System.out.println(c);	
							}	}

				}
				

	}

}
