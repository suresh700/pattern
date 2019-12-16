package Practicenew;

import java.util.Scanner;

public class palindrom 
{
	public static void main(String[]args)
	{
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enter no");
		int no=scan.nextInt();
		int temp=no;
		int rev=0;
		int rem;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}*/
		Scanner scan=new Scanner(System.in);
		String os= scan.nextLine();
		int length = os.length();
		String rev = "";
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+os.charAt(i);
		}
		
		if(rev==os)
		{
			System.out.println("its palindrom no");
		}
		else 
		{
			System.out.println("its not palindrom");
		}
		System.out.println(rev);
	}
	
}
