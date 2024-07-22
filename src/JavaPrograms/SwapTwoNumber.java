package JavaPrograms;

public class SwapTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("The value of a before swapping: " + a);
		System.out.println("The value of b before swappig: " + b);

//		int c = b;
//		b = a;
//		a = c;
//		System.out.println("The value of a after swapping: " + a);
//		System.out.println("The value of b after swappig: " + b);

		a = a - b; // -10
		b = a + b; // 10
		a = b - a;
		System.out.println("The value of a after swapping: " + a);
		System.out.println("The value of b after swappig: " + b);

	}

}
