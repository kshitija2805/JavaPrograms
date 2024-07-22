package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> a = new HashMap<>();
		a.put("a", 1);
		a.put("b", 2);
		
		HashMap<String,Integer> b = new HashMap<>();
		b.put("a", 1);
		b.put("b", 3);
		
		System.out.println(a.equals(b));
		
		//Iterating over hashMap using key set
		Iterator<String> it =  a.keySet().iterator();
		while(it.hasNext())
		{
			String key = it.next();
			System.out.println(key + " value is " + a.get(key));
		}
		
		//Iterating using entry set
		Iterator<Entry<String, Integer>>map =  a.entrySet().iterator();
		while(map.hasNext())
		{
			Entry<String, Integer> map1 = map.next();
			System.out.println("Key is: " +map1.getKey() + " and value is " +map1.getValue() );
		}
		// comparison based on keys
		System.out.println(a.keySet().equals(b.keySet()));
		
		//comparision based on values
		System.out.println(a.values().equals(b.values()));
		
		

	}

}
