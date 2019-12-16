package pattern1;

public class pattern_star {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub(
		
		{
		for(int i=1; i<=4; i++)
		{
			for(int r=1; r<=i; r++)
			{
				System.out.print(" ");
			}
			for(int j=4; j>=i; j--)
		{
			System.out.print("*");
			System.out.print(" ");
		}
			for(int j=4; j>i; j--)
			{
				System.out.print("*");
				System.out.print(" ");
				
			}
			
		System.out.println();
		

	}

	}   
	}}
