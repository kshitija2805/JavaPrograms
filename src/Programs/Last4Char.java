package Programs;

public class Last4Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1  = "kshitija";
		StringBuffer s2 = new StringBuffer();
		if(s1.length()<2)
		{
			System.out.println("String does not have 4 characters");
		}
		else
		{
			for(int i = s1.length()-1;i>=4;i--)
			{
				s2.append(s1.charAt(i));
			}
		}
		System.out.println("Last 4 characters:" + s2.reverse());

	}

}
