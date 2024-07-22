package OOPSConcepts;

public class Encap {

int wheels;
int engine;
int seating;
static String colour;

static int count;
{
	count = count + 1;
	System.out.println("Running instance block");
}

//public Encap()
//{
//	count ++;
//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encap a = new Encap();
     	Encap b = new Encap();
    	Encap c = new Encap();
//		Encap.colour="white";
//		System.out.println(a.colour +" "+ b.colour);
		Parent p = new Parent();
		Child  c1 = new Child();
		Parent p1 = new Child();
		System.out.println(a.count);
		
//		p.engine();
//		p.steering();
		

//		c.engine();
//		c.wheels();
//        c.mileage(); 
//        c.steering();
//        
        
//        p1.engine();
//        p1.wheels();
//        p1.steering();
        
        


		
		
		
//		a=c;
//		a.wheels=5;
//		b.wheels=4;
//		System.out.println(a==b);
//		System.out.println(a==c);
//		

	}
	
	public void test(int i,String s)
	{
		
	}
	
	public void test(String s,int i)
	{
		
	}

}
