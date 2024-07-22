package Programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class FindNonReapeatedCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kshitija";
		int count = 0;
		Map<Character, Integer> map = new TreeMap<>();
		char[] s1 = s.toCharArray();
		for (char a : s1) {

			if (map.containsKey(a)) {
				count = map.get(a);
				map.put(a, ++count);
			} else
				map.put(a, 1);

		}
		System.out.println(map);
		Set<Character> s2 = map.keySet();
		for (char a : s2) {
			int count1 = map.get(a);
			if (count1 == 1) {
				System.out.println("First non repeating character is:" + a + " " + "value is :" + map.get(a));
				break;
			}
		}

	}

}
