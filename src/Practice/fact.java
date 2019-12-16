package Practice;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) 
	{
		System.out.println("Enter an integer to calculate it's factorial");
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int fact=1;
		
		for(int c=1;c<=n;c++) 
		{
			fact=fact*c;
		}
         System.out.println(fact);
	}

}
