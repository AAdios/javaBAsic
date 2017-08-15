/**
* Comilation: javac WindChill.java
* Execution: java WindChill

/**
 * @author Rahul Maurya
 *version: 1.0
 * status: 14- 08-2017
 */
package com.util;
public class WindChill
	{
			static double windchill,t_Farenhite,v_WindSpeed;
		public static void main (String []args)
		{
			// Accepting i/p for tempature in Farenhite and windSpeed in velocity from command prompt

			double t_Farenhite=Double.parseDouble(adc[0]);
			double v_WindSpeed=Double.parseDouble(adc[1]);
			// Formula to calculate windchill;
			 windchill=35.74+(0.6215*t_Farenhite)+((0.4275*t_Farenhite)-35.75)*Math.pow(v_WindSpeed,0.16);
			System.out.println("The Wind chill is"+w);


		}

	}