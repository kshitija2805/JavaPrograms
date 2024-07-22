package Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheMaxRepeatedCitiesInList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		List<String> l = new ArrayList<String>();
		l.add("Agra");
		l.add("pune");
		l.add("Agra");
		l.add("Agra");
		l.add("pune");
		l.add("mumbai");
		findMaxRepeatedCities(l);

	}

	private static void findMaxRepeatedCities(List<String> l) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new HashMap<>();

		for (String s : l) {
			int count = 0;
			if (!map.containsKey(s)) {
				map.put(s, 1);
			} else {
				count = map.get(s);
				map.put(s, ++count);
			}
		}
		System.out.println(map);
	}

}
