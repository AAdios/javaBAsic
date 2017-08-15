/**
* Comilation: javac Carpayment.java
* Execution: java Carpayment

/**
 * @author Rahul maurya
 *version: 1.0
 * status: 14- 08-2017
 */
package com.util;
public class Carpayment
	{
		public static void main (String []args)
		{
			System.out.println("Enter the value of principle ,Rate and no. of year ");
			int principle=Integer.parseInt(args[0]);
			int year=Integer.parseInt(args[1]);
			float rate=Float.parseFloat(args[2]);
			int n=12*year;
			double r=(rate/12)*100;
			double payment=(principle*r)/1-(Math.pow(1+r),(-n));
			System.out.println(payment);

		}

	}