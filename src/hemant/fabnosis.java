package hemant;

import java.util.Scanner;

public class fabnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1=0;
		int no2=1;
		int no3;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter your value");
		int count = scan.nextInt();
		System.out.println(no1+""+no2);
		for(int i=2;i<=count;i++) 
		{
			no3=no1+no2;
			System.out.print(" "+no3);
			no1=no2;
			no2=no3;
		}
		

	}

}
