package Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CombineArraysAndPrintdistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int arr1[] = {3,4,5,6,7};
		ArrayList<Integer>a = new ArrayList<>();
		for(int i = 0;i<arr.length;i++)
		{
			a.add(arr[i]);
		}
		//ArrayList<Integer>b = new ArrayList<>();
		for(int i = 0;i<arr1.length;i++)
		{
			a.add(arr1[i]);
		}
		
	//a.addAll(b);
	HashSet<Integer>s = new HashSet<>(a);
	System.out.println(s);
	
	
	
	
		

	}

}
