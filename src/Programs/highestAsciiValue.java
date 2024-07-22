package Programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class highestAsciiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abgdefch";
		
		String s = "My name is Nikhil";
		String[] s1= s.split(" ");
		for(String s2 : s1)
		{
			System.out.println(s2);
		}
		
		char[] b = a.toCharArray();
		HashMap<Character,Integer> map =  new HashMap<Character,Integer>();
		for(char a1:b)
		{
			int a2 = (int)a1;
			map.put(a1, a2);
		}
		System.out.println(map);
		
		Iterator<Entry<Character, Integer>> a3 = map.entrySet().iterator();

		int minNumber = -1;
		int MaxNumber = 0;
		while(a3.hasNext())
		{
			Entry<Character, Integer>a4	=a3.next();
		    MaxNumber = a4.getValue();
			if(MaxNumber>minNumber)
			{
				minNumber = MaxNumber;
			}
		}
		
		for(Entry<Character, Integer> entry: map.entrySet())
		{
			if(entry.getValue() == MaxNumber)
			{
				System.out.println("The key for value " + MaxNumber  + " is " + entry.getKey());
		        break;
			}
		}
		

	}

}

