package Practicenew;

import java.util.Scanner;

public class armstrong 
{
	public static void main(String[] args)
	{
	Scanner scan=new Scanner(System.in);
	int no=scan.nextInt();
	int  temp=no;
	int sum = 0;
	
	
	while(temp!=0)
	{
		int rem = temp%10;
		sum=sum+rem*rem*rem;
		temp=temp/10;
	}
System.out.println(sum);
}
}
