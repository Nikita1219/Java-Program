
public class StringBuf {
	//constructor
	protected StringBuf()
	{
	}
	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		StringBuffer buf = new StringBuffer("Java");
		buf.append("Guide verl/"); //append
		buf.append(3);
		int index = 5;   //Insert
		buf.insert(index, "Student");
		index = 21;     //Set
		buf.setCharAt(index,  '.');
		int start = 23; //Replace 
		int end = 24;
		buf.replace(start,  end,  "8");
		String s = buf.toString(); //Convert to string
		System.out.println(s);

	}
}
