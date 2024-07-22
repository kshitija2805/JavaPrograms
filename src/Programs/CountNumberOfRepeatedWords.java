package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class CountNumberOfRepeatedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc one test abc abc one one one abc";
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String s2[] = s.split("\\s");
		int count = 0;
		for (String s1 : s2) {
			if (map.containsKey(s1)) {
				count = map.get(s1);
				map.put(s1, ++count);
			} else
				map.put(s1, 1);
		}
		System.out.println(map);
		Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
		int value = 0;
		while (it.hasNext()) {
			Entry<String, Integer> en = it.next();
			int actvalue = en.getValue();
			if (actvalue >= value) {
				value = actvalue;
				System.out.println(en.getKey());
			}

		}

	}
}
