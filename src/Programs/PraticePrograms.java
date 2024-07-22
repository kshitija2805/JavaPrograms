package Programs;

public class PraticePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("prachi",""));
		

	}
	
	public static String reverseString(String s,String s1)
	{
		try
		{
			for(int i =s.length()-1;i>=0;i--)
			{
				char a = s.charAt(i);
				s1 = s1.concat(s.valueOf(a));
			}
			
			return s1;
			
		}
		catch(NullPointerException e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("abc");
		return s1;
		
		
	}

}
