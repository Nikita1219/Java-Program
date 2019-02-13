class Count
{
	public static void main(String [] args)
	{
		// for loop
		
		int i;
		System.out.println("even \t odd:");
		for(i=0;i<=10;i++)
		{	
			if(i%2==0)
				{
					//System.out.println("even:");
					System.out.print(i);
				}
			else
				{
					//System.out.println("\t odd:");
					System.out.println("\t"+ i);
				}	
		}		
		/*for(count=0;count<10;count++)
		{
			System.out.println(count);
		
		}
		//do while
		do
		{
				System.out.println(count);
				count++;
		}
		while(count<10);
		
		//while 
		int sum =0;
		int i=1;
		int n=10;
		
		while(i<=n)
		{
			sum = sum+i;
			i=i+1;
		}	
		System.out.println(sum);*/
	}	
}	