package hemant;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your value");
		original=scan.nextLine();
		int length = original.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+ original.charAt(i);
		}
		System.out.println(reverse);
		if (reverse.equals(original)) 
		{
			System.out.println("its palandrome");
		}
		else
			System.out.println("its not palindrome");
	
		
		

	}
	}
