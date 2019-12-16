package Practicenew;

import java.util.Scanner;

public class reverstring 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
				String os= scan.nextLine();
				int length = os.length();
				String rev = "";
				
				for(int i=length-1;i>=0;i--)
				{
					rev=rev+os.charAt(i);
				}
				System.out.println(rev);
	}

}
