package Practice;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n = s.nextInt();
		int temp = n;//n=153
		int sum = 0;
		
		while(temp!=0)
		{
			int reminder = temp%10;// 1.153%10==15.3 2.15%10==1.5 3.1%10=0.1
			sum=sum+reminder*reminder*reminder;// 1.sum=0+3*3*3==27 2.sum=27+5*5*5==152 3.sum=152+1*1*1=153
			
			temp=temp/10;// 153/10==15 2.15/10==1 3.1/10==0.1----conditon fail 0!=0
			
			
		}
			//System.out.println(sum);
			if (n == sum)
		         System.out.println(n + " is an Armstrong number.");
		      else
		         System.out.println(n + " isn't an Armstrong number.");   
	}

}
