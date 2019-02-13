import java.util.Scanner;

class Oddeven
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a ");
		int a1 = scan.nextInt();
		
		
		if(a1%2==0)
		{ 
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
}	