import java.util.Scanner;

class Person
{
	String name;
	int age;
	
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
}
class PersonTest
{
	public static void main(String [] args)
	{
		Person objPerson = new Person();
		objPerson.input();
		objPerson.print();
	}
}
		