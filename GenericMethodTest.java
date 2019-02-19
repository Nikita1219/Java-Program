
public class GenericMethodTest {
	//generic method printArray
	public static <E> void printArray(E[] inputArray)
	{
		//Display array elements
		for(E element : inputArray)
		{
			System.out.printf( "%s", element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create arrays of integer , double, character
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4};
		Character[] charArray = {'H','E','L','L','O'};
		
		System.out.println("Array intergerArray contains : ");
		printArray(intArray); //pass an Integer array
		
		System.out.println("\nArray doubleArray contains :");
		printArray(doubleArray); //pass an double array
		
		System.out.println("\nArray characterArray contains :");
		printArray(charArray); // pass an character array

	}

}
