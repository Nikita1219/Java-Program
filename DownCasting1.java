public class DownCasting1
{
	public static void main(String [] args)
	{
		Game1 game2 = new Cricket1();
		
		Chess1 chess = (Chess1) game2;
		//Error
		//Chess chess = (Chess) game2;
		
		//Solution :
		
		if(game2 instanceof Cricket1)
		{
			Cricket1 cricket = (Cricket1) game2;
			game2.play();
			game2.noOfPlayers();
			game2.winner("B");
		}
		else if(game2 instanceof Chess1)
		{
			Chess1 chess = (Chess1) game2;
			game2.play();
		}
	}
}