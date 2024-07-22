package OOPSConcepts;

public class JavaConceptsStaticBlock {
	
	static int  i ;
	static String g ;
	 int j;
	 String h;
	
	static 
	{
		i = 0;
		g = "abc";
		System.out.println("static block");
	}
	{
		j = 1;
		h = "pqr";
	}
	
	public JavaConceptsStaticBlock()
	{
		System.out.println("This is first constructor");
}
	public JavaConceptsStaticBlock(int i,int j)
	{
		this();
		System.out.println("This is secoond constructor");
	}
	public JavaConceptsStaticBlock(int i,int j,int k)
	{
		this(k, k);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(JavaConceptsStaticBlock.i);
//		JavaConceptsStaticBlock j = new JavaConceptsStaticBlock();
//		System.out.println(j.h);
//		JavaConceptsStaticBlock k = new JavaConceptsStaticBlock(0,0);
		JavaConceptsStaticBlock d = new JavaConceptsStaticBlock(0,0,0);

	}

}
