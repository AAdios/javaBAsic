/***********************************************
 * COMPILATION:javac TemperatureConversion.java 
 * EXECUTION :java TemperatureConversion
 *
 *
 *
 * @Author: Adesh varma
 *Version:1.0
 *Date:13/08/2017
*****************************************/
package com.profound.util; 

import java.util.Scanner;

public class TemperatureConversion 
{     
         static double fareinheit,celcius;
         static double result; /// static variable declaration f
         static int choice;
     public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("1:Fareinheit to Celcius");
        System.out.println("2: Celcius to Fareinheit");
        choice=in.nextInt();
        switch(choice)
        {
            case 1:
            {
                System.out.println("Enter fareinheit:");
                fareinheit=in.nextInt();
                result=(fareinheit-32)*5/9;
                System.out.println(result+" "+"degree celcius");
                break;
            }
            
            case 2:
            System.out.println("Enter celcius:");
                celcius=in.nextInt();
                result=(celcius*9/5)+32;
                System.out.println(result+" "+"degree fareinheit");
                break;
          
            default:
            {
                System.out.println("Invalid input");
            }
        }
        
  }