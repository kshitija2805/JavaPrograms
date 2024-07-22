package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> a = new ArrayList<>(Arrays.asList(19, 18, 788, 1111,18,1111));
		List<Integer> b = new ArrayList<>();
//		for (Integer s : a) {
//			String s1 = String.valueOf(s);
//			if (s1.charAt(0) == '1') {
//				System.out.println("This number starts with 1:" + s);
//			}
//		}
		Set<Integer>c = new HashSet<>();
		for(Integer s : a)
		{
			if(c.contains(s))
			{
				b.add(s);
			}
			else
			{
				c.add(s);
			}
		}
		System.out.println(b);
		

	}

}
