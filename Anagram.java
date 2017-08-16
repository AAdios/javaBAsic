import java.util.Scanner;
public class Anagram
{
	static String name1,name2;
	static int len,len1,len2,i,j,found=0,not_found=0;
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name1 and name2 you want to check");
		name1=s.nextLine();
		name2=s.nextLine();
		
		len1=name1.length();
		len2=name2.length();
		
		if(len1==len2)
		{
			len=len1;
			for(i=0;i<len;i++)
			{
				found=0;
				for(j=0;j<len;j++)
				{
					if(name1.charAt(i)==name2.charAt(j))
					{
						found=1;
						break;
					}	
				}
				if(found==0)
				{
					not_found=1;
					break;
				}
			}
			if(not_found==1)
			{
				System.out.println("Both names are not anangram");
				
			}
			else
			{
				System.out.println("Given names are anangram");
				
			}
		}
			else
			{
				System.out.println("names Entered must have equal in length");
			}
			
		
	}	
}	