package Programs;

public class SplitTheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "11abc11abc11xyz11";
		s1.trim();
		String s2[] = s1.split("11");
		for(String s:s2)
		{
			System.out.println(s);
		}
		System.out.println("Length of array is:"+ s2.length);
		System.out.println(s2[0] +":"+s2[0].length());
	}

}
