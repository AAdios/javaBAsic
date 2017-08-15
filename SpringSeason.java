/**
* Comilation: javac springSeason.java
* Execution: java springSeason

/**
 * @author Rahul maurya
 *version: 1.0
 * status: 14- 08-2017
 */
package com.util;
import java.util.Scanner;
public class SpringSeason {
		static int  month,day; // static variable declaration;
	public static void main(String[] args) {
			System.out.println("Enter the Month and Date you want to check");
			Scanner sc=new Scanner(System.in);// craeting Scanner class object;
			 month=sc.nextInt(); // Accepting Month and Date from the user
			 day =sc.nextInt();

			 // Condition  for given Month  and Date is Spring season or not;

			if((month==3 && day>=20 && day<=31)||(month==4 && day>=1 && day<=30)||(month==5 && day>=1 && day<=31)||(month==6 && day>=1 && day<=20))
			{
				System.out.println("The entered month and day belongs to Springeseason");

			}
			else
			{System.out.println("you come in wrong season");}
	}

}
