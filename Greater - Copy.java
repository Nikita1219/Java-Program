import java.util.Scanner;

class Greater
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a ");
		int a1 = scan.nextInt();
		System.out.println("enter b ");
		int b1 = scan.nextInt();
		System.out.println("enter c ");
		int c1 = scan.nextInt();
		
		if(a1>b1&&a1>c1)
		{ 
			System.out.println("a is greater");
		}
		else if(b1>c1)
		{
			System.out.println("b is graeter");
		}
		else
			
		{
			System.out.println("c is greater");
		}	
	}
}	