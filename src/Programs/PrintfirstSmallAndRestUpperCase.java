package Programs;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintfirstSmallAndRestUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> str = new ArrayList<String>(Arrays.asList("abc","apple","orange","asd","away"));
		ArrayList<String> str1 = new ArrayList<String>();
		ArrayList<String> str2 = new ArrayList<String>();
		
	    for(String a : str)
	    {
	    	char first = a.charAt(0);
	    	if(first == 'a')
	    	{
	    		str1.add(a);
	    	}
	    }
	    for(String a : str1)
	    { 
	    	String finalResult = "";
	    	for(int i = 0;i<a.length();i++)
	    	{
	    		if(!(i == 0))
	    		{   
	    			char e = a.charAt(i);
	    			finalResult = finalResult + String.valueOf(Character.toUpperCase(e));
	    		}
	    		else
	    		{
	    			finalResult = finalResult + a.charAt(0);
	    		}
	    	}
	    	str2.add(finalResult);
	    }
	    System.out.println(str2);
	    
	    

	}

}
