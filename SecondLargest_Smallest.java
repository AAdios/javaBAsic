/**
* Comilation: javac SecondLargest_Smallests.java
* Execution: java SecondLargest_Smallest

/**
 * @author Adesh varma
 *version: 1.0
 * status: 14- 08-2017
 */
import java.util.Scanner;
public class SecondLargest_Smallest
{
	static int number,temp; // static variable declration
		
		public static void main(String[] args) 
    {
       
        Scanner s = new Scanner(System.in); // creating Scanner class object
        System.out.print("Enter no. of elements you want in array(Minimum 2):");
        number = s.nextInt(); // accepting i/p from the user;
       int  a[] = new int[number]; // creating array class object
        System.out.println("Enter all the elements:");
        for (int i = 0; i < number; i++) 
        {
            a[i] = s.nextInt(); // storing the value in the array
        }
        for (int i = 0; i < number; i++) 
        {
            for (int j = i + 1; j < number; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
  
                 }
            }
        }
        System.out.println("Second Largest:"+a[number-2]);
        System.out.println("Smallest:"+a[0]);
    }
}