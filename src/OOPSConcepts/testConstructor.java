package OOPSConcepts;

public class testConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Child();
		p.engine();
		p.steering();
		p.wheels();
		Child c = (Child) new Parent();
		c.steering();
		c.mileage();
		c.engine();

	}

}
