package Programs;

import java.util.Arrays;

public class ReverseTheStringByKeepingTheSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String reversrarr = reverse("I love coding");
		System.out.println(reversrarr);

	}

	private static String reverse(String s) {
		// TODO Auto-generated method stub
		char[] arr = s.toCharArray();
		String reverseString = "";
		int l = 0;
		int r = arr.length - 1;
		while (l <= r) {
			if (arr[l] != ' ' && arr[r] != ' ') {
				char temp = arr[l];
				arr[l] = arr[r];
				arr[r] = temp;
				l++;
				r--;

			}
			else if(arr[l] == ' ' ) 
			{
				l++;
			}
			else 
			{
				r--;
			}
		}
		
		//return arr;
		for(char a:arr)
		{
			reverseString = reverseString.concat(String.valueOf(a));
		}
		return reverseString;

	}

}
