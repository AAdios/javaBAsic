package com.util;
public class RollDie
{
		static int i,greater; // static variable declaration 
		static int array[];	//  static array declaration 
	public static void main(String []args)
	{
              int array[]=new int[6];
			System.out.println("Enter the no. of times you want a die to roll");
			Scanner sc=new Scanner(System.in); // Scanner object creation 
			int n=sc.nextInt(); // Accepting i/p from user
			for(i=1;i<=n;i++)
			{
				int Random_number=(int)(Math.random()*6)+1; // generating random number and performing typeCasting from double to int;
		
				switch(Random_number) 
					{
						case 1:array[0]++;
							break;
						case 2:array[1]++;
								break;
						case 3:array[2]++;
							break;
						case 4:array[3]++;
							break;
						case 5:array[4]++;
								break;
						case 6:array[5]++;
								break;
					}
			}
				int greater=array[0]; // Suppose aaray[0] is maximum;
				for(i=0;i<array.length;i++) // aaray.length is used to find the lenth of the aaray
					{
						if(array[i]>greater) // if aaray[i] is greater than greater the  swap the number
						{
							greater=array[i];
						}
					}			
				System.out.println("No. Repeated most is:"+greater);
	}


}