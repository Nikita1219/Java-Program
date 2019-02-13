import java.util.Scanner;

class Table
{
	public static void main(String [] args)
	{
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		for(int j= 1;j<=10;j++)
		{
			
			System.out.println(n*j);
		}
	}	
}	