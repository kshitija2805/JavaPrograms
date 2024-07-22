package Programs;

import java.util.ArrayList;

public class ReverseTheStringKeepDigits {
	static StringBuffer s2 = new StringBuffer();

	public static void main(String[] args) {
		String s = "a123bc";
		StringBuffer s1 = new StringBuffer();

		for (int i = 0; i < s.length(); i++) {
			char a = s.charAt(i);
			if (!(Character.isDigit(a))) {
				s1.append(a);
				if(i == (s.length()-1))
				{
					reverse(s1);
				}

			} else {
				reverseAndAppend(s1, a);
			}
		}
		System.out.println(s2);

	}

	private static void reverse(StringBuffer s1) {
		// TODO Auto-generated method stub
		s1.reverse();
		s2.append(s1);
		s1.setLength(0);
		
	}

	private static void reverseAndAppend(StringBuffer s1, char a) {
		s1.reverse();
		s1.append(a);
		s2.append(s1);
		s1.setLength(0);

	}
}
