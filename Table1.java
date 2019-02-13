import java.util.Scanner;

class Table1
{
	public static void main(String [] args)
	{
		int a=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		for(int i=1;i<6;i++)
		{
			int n = sc.nextInt();
			if(n>0)
			{
			a=a+n;	
				
			}
			else			
			{
			continue;
			}
		}
		
		System.out.println(a);
	}
}	
		