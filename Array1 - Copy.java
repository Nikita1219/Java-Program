class Array1
{
	public static void main(String [] args)
	{
		int[] numbers = { 8,18,5,2,1,10};
		System.out.println("total number of elements in an array is :" + numbers.length);
		System.out.println("first element in an array is :" + numbers[0]);
		System.out.println("last element in an array is :" + numbers[numbers.length -1]);
	
	//sum of array elements
	int sum=0;
	for(int i=0;i<numbers.length;i++)
	{
		System.out.println("array elements "+ numbers[i]);
		sum+=numbers[i];
	}
	System.out.println("the sum of array elements: " +sum);
}	
}