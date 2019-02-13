class Empolyee 
{
	protected String name;
	protected int empid;
	protected String address;
	
	Empolyee() {
	}                              // default const

	Empolyee(final String str, final int num, final String addr) //parameterized const
	{
		name = str;
		empid = num;
		address = addr;
	}
	void display()
	{
		System.out.println(" The name is :" + name);
		System.out.println(" The empid is :" + empid);
		System.out.println(" The address is :"+ address);
	}
}
class Manager extends Empolyee
{
	protected String post;
	protected int salary;
	
	Manager(){
	}
	
	Manager(final String str, final int num, final String addr,final String ps,final int sal)
	{
		super(str,num,addr);
		post = ps;
		salary = sal;
	}
	void display()
	{
		super.display();
		System.out.println("The post is :" + post);
		System.out.println("The salary is:" + salary);
	}
}
class Developer extends Empolyee
{
	protected String skills;
	
	Developer(){
	}
	
	
	Developer(final String str, final int num, final String addr,final String ski)
	{
		super(str,num,addr);
		skills=ski;
	}
	void display()
	{
		System.out.println("The skills is :" + skills);
	}
}
class Test6
{
	public Test6(){
	}
	public static void main(String [] args)
	{
		Manager mgobj = new Manager("nikita",101,"paris","HR",50000);
		mgobj.display();
	
		Developer dpobj = new Developer("neeti",102,"us","java");
		dpobj.display();
		
		Empolyee empobj = new Manager("niharika",103,"uk","Process",480000);
		empobj.display();
		
		Empolyee empobj1 = new Developer("kanika",104,"delhi","java");
		empobj1.display();
	}
}


	
		
	
	