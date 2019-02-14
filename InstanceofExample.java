public class InstanceofExample
{
	public static void main(String[] agrs)
	{
		
		Vechicle vehicle = new Vechicle();
		Car car = new Car();
		MotorCycle moto = new MotorCycle();
		
		System.out.println("vehicle instanceof Vechicle: " + (vehicle instanceof Vechicle));
		System.out.println("car instanceof Vechicle :" + (car instanceof Vechicle));
		System.out.println("car instanceof: " + (car instanceof Car));
		System.out.println("car instanceof DriveCar : " + (car instanceof DriveCar));
		System.out.println("moto instanceof Vechicle: " + (moto instanceof Vechicle));
		System.out.println("moto instanceof MotorCycle: " + (moto instanceof MotorCycle));
		
		
		System.out.println("vehicle instanceof Car: " +(vehicle instanceof Car));
		System.out.println("vehicle instanceof DriveCar : " + (vehicle instanceof DriveCar));
		System.out.println("moto instanceof DriveCar: " + (moto instanceof DriveCar));
		
		car = null;
		System.out.println("(car = null) instanceof Vechicle: " + (car instanceof Vechicle));
		System.out.println("(car null) instanceof car :" + (car instanceof Car));
	}
}
class Vechicle
{
	class Car extends Vechicle implements DriveCar
	{
	}
	class MotorCycle extends Vechicle
	{
	}
	interface DriveCar
	{
	}
}