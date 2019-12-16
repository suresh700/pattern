package Practice;

import java.util.Scanner;

public class Fibnosis 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int count=scan.nextInt();
		int no1=0;
		int no2=1;
		int no3;
		
		System.out.print(no1+" "+no2);
		
		for(int i=2;i<count;i++)
		{
			no3=no1+no2;
			System.out.print(" "+no3);
			
			no1=no2;
			no2=no3;
			
		}
		
		
	}

}
