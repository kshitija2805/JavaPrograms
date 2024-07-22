package Programs;

public class PrintWithBlankMain {
	
	public static int method()
	{
		System.out.println("Hello world");
		return 1;
	}
 
	static int p = method();
	
	public static void maxNum(int a,int b,int c)
	{
	    int max = 0;
		while(a>0 || b>0 || c>0)
		{
			a--;
			b--;
			c--;
			max++;
		}
		System.out.println(max);

	}
	
	public static void minNum(int a,int b,int c)
	{
	    int min = 0;
		while(a>0 && b>0 && c>0)
		{
			a--;
			b--;
			c--;
			min++;
		}
		System.out.println(min);

	}
	
	public static void  minAndMax (int a,int b,int c)
	{
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if(b>c && b> a)
		{
			System.out.println(b);
		}
		else
			System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		maxNum(10,20,30);
//		minNum(10,20,30);
		minAndMax(-30,10,20);

	}

}
