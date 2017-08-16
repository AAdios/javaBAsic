 /***********************************************
 * COMPILATION:javac SqrtNewtonMethod.java 
 * EXECUTION :java SqrtNewtonMethod
 *
 *
 *
* @Author:  Adesh varma
 *Version:1.0
 *Date:10/08/2017
*****************************************/
package com.profound.util;

import java.lang.Math;
import java.util.Scanner;

public class SqrtNewtonMethod 
{
      static int numberInput;
       static double estimate; // static variable declaration 
      static double epsilon;
    public static void main(String[] args) 
    {
       
								
        epsilon=1e-15; // epsilon constatnt 
        Scanner in=new Scanner(System.in); // creating the Scanner class obeject
        System.out.println("Enter a number:");
        numberInput=in.nextInt();
        //estimate is for estimation purpose
        estimate=numberInput;
        //if estimate is not equal to root
        //update estimate
        while(Math.abs(estimate-numberInput/estimate)>epsilon*estimate)
        {
            estimate=(estimate+numberInput/estimate)/2.0;
        }
             }
        System.out.println(estimate);
    }
}