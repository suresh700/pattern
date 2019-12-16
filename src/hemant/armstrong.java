package hemant;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temp,reminder,sum=0	;
Scanner scan=new Scanner(System.in);
System.out.println("enter your value");
temp=scan.nextInt();
while(temp!=0) 
{
	reminder=temp%10;
	sum=sum+reminder*reminder*reminder;
	temp=temp/10;
	}
System.out.println(sum);

	if(sum==temp)
	{
		System.out.println("its armstrong number");
	}
	else
	{
		System.out.println("its not armstrong number");
	}
	}}
