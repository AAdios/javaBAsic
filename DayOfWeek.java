package com.util;
import java.util.Scanner;

public class DayOfWeek {

	public static void main(String[] args) {
	System.out.println("Enter the year month and date");
	Scanner sc=new Scanner(System.in);
	int  year=sc.nextInt();
	int   month=sc.nextInt();
	int  date=sc.nextInt();
	int  year1 =year-(14-month)/12;
	  int date1=year1+(year1/4)-(year1/100)+(year1/400);
	   int month1=month+(12*((14-month)/12))-2;
	  int  days=(date+date1+(31*month1/12))%7;
System.out.println(days);

	}
}