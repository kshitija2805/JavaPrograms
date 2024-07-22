package JavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class CheckNumberEvenOrOdd {
	static List<Integer> even = new ArrayList<Integer>();
	static List<Integer> odd = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -90 };

		evenOdd(a);
		System.out.println(even);
		System.out.println(odd);

	}

	private static void evenOdd(int[] a) {
		// TODO Auto-generated method stub
		for (int i : a) {
			int rem = i % 2;
			if (!(rem == 0)) {
				odd.add(i);
			} else {
				even.add(i);
			}
		}

	}

}
