package Programs;

public class CompareStringAndStringBuffer {
	
	
	
	public CompareStringAndStringBuffer()
	{
		System.out.println("Main constructor");
	}
	public CompareStringAndStringBuffer(int i)
	{
		super();
		System.out.println("Main constructor 1: "+i);
	}
	public CompareStringAndStringBuffer(int i,int j)
	{
		this();
		System.out.println("Main constructor 2:" + i +" "+j);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompareStringAndStringBuffer s = new CompareStringAndStringBuffer(30,40);
		//CompareStringAndStringBuffer s1 = new CompareStringAndStringBuffer(30);

	}

}
