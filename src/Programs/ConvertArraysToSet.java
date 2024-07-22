package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class ConvertArraysToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 4, 3, 1 };
		HashSet b = new HashSet<Integer>();
		for (int i : a) {
			b.add(i);
		}
		System.out.println(b);

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
//		for (Integer i : numbers) {
//			System.out.println(i);
//		}
		
		Iterator<Integer>it = numbers.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next() + " ");
		}
		
		HashMap<String,Integer> d = new HashMap<String,Integer>();
		d.put("a", 1);
		d.put("a", 2);
		d.put("b", 3);
		d.put("c", 4);
//		Iterator<Entry<String, Integer>>f = d.entrySet().iterator();
//		while(f.hasNext())
//		{
//			Entry<String, Integer> d1 = f.next();
//			System.out.println(d1.getKey() + " " + d1.getValue());
//		}
		
		for(Entry<String, Integer>f1 : d.entrySet())
		{
			String key = f1.getKey();
			if(key.equals("a"))
			{
				f1.setValue(4);
			}
			System.out.println(f1.getKey() + " " + f1.getValue());
		}
		
		
	}

}
