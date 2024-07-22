package Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class FilterDuplicateElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*********
		 * int [] a = {1,1,2,2,3,4,3,5}; 
		 *  Set <Integer> a1 = new HashSet<Integer>(Arrays.asList(1,2,9,0,6,7,7));
		 *  List <Integer> a2 = new ArrayList<>(a1); 
		 *  System.out.println(a2);
		 *************/
		/************************************************************************************************
		 * String a = "aaaabbbcccppxxx"; 
		 * String a1 = ""; 
		 * Map<Character, Integer> map =new LinkedHashMap<>(); 
		 * char[] a2 = a.toCharArray(); 
		 * for (char c : a2)
		 * { 
		 * if
		 * (!map.containsKey(c)) 
		 * { map.put(c, 1); } 
		 * else { 
		 * int i = map.get(c);
		 * map.put(c, ++i); } 
		 * } System.out.println(map); 
		 * 
		 * Iterator<Entry<Character,Integer>> it = map.entrySet().iterator(); 
		 * while (it.hasNext()) {
		 * Entry<Character, Integer> entry = it.next(); 
		 * String c =String.valueOf(entry.getKey()); 
		 * String i = String.valueOf(entry.getValue());
		 * a1 = a1.concat(c).concat(i);
		 * 
		 * } System.out.println(a1);
		 * 
		 ***********************************************************************************************/
		/****** longest substring without repeated character ***************/
		String a = "abcdebcda";
		List<String> a1 = new ArrayList<>();
		for (int start = 0; start < a.length(); start++) {
			LinkedHashSet<String> set1 = new LinkedHashSet<>();
			String a2 = "";
			for (int end = start; end < a.length(); end++) {
				char c = a.charAt(end);
				if (!set1.contains(String.valueOf(c))) {
					set1.add(String.valueOf(c));
				} else
					break;
			}
			for (String s : set1) {
				a2 = a2.concat(s);
			}
			a1.add(a2);

		}
		System.out.println(a1);
		String longest = a1.get(0);
		for(int i = 1;i<a1.size();i++)
		{
			if(longest.length()<= a1.get(i).length())
			{
				longest = a1.get(i);
			}
		}
		System.out.println(longest);

	}

}
