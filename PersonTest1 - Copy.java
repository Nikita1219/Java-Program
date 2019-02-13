import java.util.Scanner;
//data abstraction
class Person1
{
	private String name;
	private int age;
	private String constituency;
	Scanner s;
	
	Person1() // constructor
	{
		System.out.println("your constituency ");
		age=0;
		name="";
		constituency="noida";
		s = new Scanner(System.in);
	}
	Person1(String n,int a) //parameterized const
	{
		name =n;
		age=a;
	}
	Person1(String n,int a,String c)
	{
		name =n;
		age=a;
		constituency=c;
	}
	
	
	void input()
	{
		
		System.out.println("Enter your name:");
		name = s.next();
		System.out.println("Enter your age:");
		age = s.nextInt();
	}
	void print()
	{
		System.out.println("Name is:" + name);
		System.out.println("Age is:" + age);
		System.out.println("constituency is :" + constituency);
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
		Person1 objPerson2= new Person1("raj",30);
		Person1 objPerson3= new Person1("nikita",20,"delhi"); //overide delhi 
		
		objPerson.input();
		objPerson.eglibletoVote();
		objPerson.print();
		
		
		objPerson2.eglibletoVote();
		objPerson2.print();
		
		objPerson3.eglibletoVote();
		objPerson3.print();
		
	}
}
		