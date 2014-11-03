package com.jogi.practiceproblems;

public class DuplicatesSortedArray {

	public void duplicateValue(int[] array)
	{
		
		for(int i=0;i<array.length-1;i++)
		{
			if(array[i]==array[i+1])
			{
				System.out.println("Duplicate value is "+array[i]);
			}
		}
	}
}
