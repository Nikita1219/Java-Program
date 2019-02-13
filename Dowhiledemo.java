import java.util.Scanner;

class Dowhiledemo
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		//String guess;
		int guess;
		
		do
		{
			System.out.print("Guess my name:");
			//guess = scan.nextLine();
			int guess = scan.nextInt();
		}
		while(!'1'.equals(guess));
		System.out.println("congratulations u guessed my name correctly");
	}
}	