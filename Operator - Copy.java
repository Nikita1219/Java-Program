import java.util.Scanner;

class Operator
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a ");
		int a1 = scan.nextInt();
		System.out.println("enter b ");
		int b1 = scan.nextInt();
		System.out.println("enter operation ");
		char c1 = scan.next().charAt(0);
		
		switch(c1)
		{
			case '+' : 
			System.out.println(" the addition of 2 no's :" + (a1+b1));
			break;
			
			case '-' : 
			System.out.println(" the subtraction of 2 no's :" + (a1-b1));
			break;
			
			case '*' : 
			System.out.println(" the multiplication of 2 no's :" + (a1*b1));
			break;
			
			case '/' : 
			System.out.println(" the subtraction of 2 no's :" + (a1/b1));
			break;
			
			default:
			System.out.println("wrong");
		}	
	}
}	