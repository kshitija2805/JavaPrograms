package Programs;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementsFromArraysAndString {

	static ArrayList<String> a = new ArrayList<>();
	static ArrayList<String> b = null;
	static String resultString;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Kshitija";
		// RemoveDuplicate(s);
		System.out.println(" Strint without Duplicate is : " + RemoveDuplicate(s));

	}

	private static String RemoveDuplicate(String s) {
		// TODO Auto-generated method stub

		if (s == null) {
			System.out.println("String is empty");
		}

		else {

			for (int i = 0; i < s.length(); i++) {
				a.add(String.valueOf(s.charAt(i)));
			}

			LinkedHashSet<String> c = new LinkedHashSet<>(a);
			b = new ArrayList<>(c);

		}
		
		 StringBuffer sb = new StringBuffer();
          for(String c : b)
          {
        	 sb.append(c);
          }
          
          return resultString = sb.toString();

	}

}
