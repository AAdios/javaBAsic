/**
* Comilation: javac WindChill.java
* Execution: java WindChill

/**
 * @author adesh varma
 *version: 1.0
 * status: 14- 08-2017
 */
package com.util;

public class Distance
	{	
			static int number1,number2;
			// static variable declaration
			static double distance;
		public static void main (String []args)
		{
			number1=Integer.parseInt(args[0]);
			number2=Integer.parseInt(args[1]);
			double distance=Math.sqrt(number1*number1+number2*number2); // formula to calculate distance=sqrt(x^2+y^2);
			System.out.println("The distance is"+distance);

		}

	}
