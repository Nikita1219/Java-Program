import java.util.Scanner;
//data abstraction
class Person
{
	private String name;
	private int age;
	
	Person
	{
		System.out.println("In default constructor");
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
class PersonTest
{
	public static void main(String [] args)
	{
		Person objPerson = new Person();
		objPerson.input();
		objPerson.print();
		objPerson.eglibletoVote();
	}
}
		