import java.util.Scanner;
//encapsulation
class Student
{
	String name;
	int age;
	float percent;
	int marks[]=new int[5];
	String branch;
	int rollno;
	int sum=0;
	
	
	void input()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your name:");
		name = s.next();
		System.out.println("Enter your age:");
		age = s.nextInt();
		System.out.println("Enter your branch:");
		branch = s.next();
		System.out.println("Enter your roll no:");
		rollno = s.nextInt();
		System.out.println("Enter your marks:");
		for(int i=0;i<5;i++)
		{
			marks[i] = s.nextInt();
			sum =sum+marks[i];
		}
		
	}
	void print()
	{
		System.out.println("Name is:" + name);
		System.out.println("Age is:" + age);
		System.out.println("Branch is:" + branch);
		System.out.println("Rollno is:" + rollno);
		System.out.println("percentage is :"+ percent);
	}
	void percentage()
	{
		percent=(float)(sum*100)/500;
	}
	
	void marksCalculate()
	{
		if(percent<60)
		{
			System.out.println("distinction");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
}
class Student1
{
	public static void main(String [] args)
	{
		Student objSt = new Student();
		objSt.input();
		
		objSt.marksCalculate();
		objSt.percentage();
		objSt.print();
	}
}
		