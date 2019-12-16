package Practiceintnew;

import java.util.Scanner;

public class dupnu 
{

	public static void main(String[] args) 
	{	//int count=0;
		Scanner Scan=new Scanner(System.in);
		String str= Scan.nextLine();
		int length=str.length();
		char[]a=str.toCharArray();
		
		for(int i=1;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[i]==a[j])
				{	
					
				
					System.out.println(a[j]);
					//count++;
					//System.out.println(count);
				}
			
			}
		}

	


}
}