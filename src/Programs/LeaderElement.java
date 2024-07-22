package Programs;

public class LeaderElement {
	
	public static void finLeader(int num[])
	{
		int max = num[num.length-1];
		for(int i = num.length-2;i>=0;i--)
		{
		   if(num[i]>max)
		   {
			   System.out.print(num[i] + " ");
			   max = num[i];
		   }
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int num[] = {92,7,12,9,8,3};
	   finLeader(num);

	}

}
