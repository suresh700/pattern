package Practicenew;

import java.util.Scanner;

public class revrseno
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
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
		}
		System.out.println(rev);

	}

}
