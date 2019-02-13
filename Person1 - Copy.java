import java.util.Scanner;
//data abstraction
class Person1
{
	String name;
	int age;
	
	person() // constructor
	{
		System.out.print("In default constructor");
	}
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = s.next();
		System.out.println("Enter your age:");
		age = s.nextInt();
	}
	void print()
	{
		System.out.println("Name is:" + name);
		System.out.println("Age is:" + age);
	}
	void eglibletoVote()
	{
		if(age>18)
		{
			System.out.println("vote");
		}
		else
		{
			System.out.println("cannot vote");
		}
		
	}
	
}
class PersonTest1
{
	public static void main(String [] args)
	{
		Person1 objPerson = new Person1();
		objPerson.input();
		objPerson.print();
		objPerson.eglibletoVote();
	}
}
		