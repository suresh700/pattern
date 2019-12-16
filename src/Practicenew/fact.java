package Practicenew;

import java.util.Scanner;

public class fact 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int no=scan.nextInt();
		int fact=1;
		
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
System.out.println(fact);
	}

}
