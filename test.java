import java.util.Scanner;

class Test
{
	public static void main(String [] args)
	/*{
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			
		int sum=a+b+c;
		float avg=(float)(a+b+c)/3;
		
		
		
		System.out.println("the sum:"+ sum);
		System.out.println("the avg:"+ avg);
	}	*/
	
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a ");
		int a1 = scan.nextInt();
		System.out.println("enter b ");
		int b1 = scan.nextInt();
		System.out.println("sum is:" + (a1+b1));
	}	
		
}	