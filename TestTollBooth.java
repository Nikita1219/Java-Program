interface TollBooth // first here we create interface Tollbooth implements by Tollbooth
{
	public void DisplayData();
	public void calculateToll(Truck T);
}
interface Truck // second here we create interface Truck Implements By Truck1
{
	public int getAxles();
	public int getWeight();
}
class Toll implements TollBooth {
    Toll() 
	{
        truckcount = 0;
        receipts = 0;
    }
    public void calculateToll(Truck T) 
	{
        int axles = T.getAxles();
        int Weight = T.getWeight();
        int tollDue = 5*axles + 10*(Weight/1000)/2;
        System.out.println("No. of axles: "+ axles+ " axles");
        System.out.println("weight of the truck: "+ Weight + "tones" );
        truckcount = truckcount + 1;
        receipts = receipts + tollDue;
        System.out.print("Amount due For truck "+ truckcount + " : ");
        System.out.println(tollDue);
    }
    public void DisplayData() 
	{
        System.out.println("No. Of Trucks Pass The TOLL: " + truckcount);
        System.out.println("Total amount of Receipts when "+truckcount + " Truck Passes The Toll :" + receipts);
    }
    int receipts;
    int truckcount;
	}
 class Truck1 extends Toll  implements Truck {
    Truck1(int axles, int Weight) 
	{
        this.axles = axles;
        this.Weight = Weight;
    }
    public int getAxles() 
	{
		return axles;
	}
    public int getWeight() 
	{
		return Weight;
	}
    int axles;
    int Weight;
}
class TestTollBooth  {
    public static void main(String [] args) 
	{
        Toll booth = new Toll();
        Truck1 Ford = new Truck1(5,12000);
        Truck1 Nissan = new Truck1(2,5000);
        Truck1 Daewoo = new Truck1(6,17000);
        System.out.println("FORD TRUCK BE :");
        booth.calculateToll(Ford);
        booth.DisplayData();
        System.out.println("*************************************************************");
        System.out.println("NISSAN TRUCK BE :");
        booth.calculateToll(Nissan);
        booth.DisplayData();
        System.out.println("*************************************************************");
        System.out.println("DAEWOO TRUCK BE :");
        booth.calculateToll(Daewoo);
        booth.DisplayData();
    }
}