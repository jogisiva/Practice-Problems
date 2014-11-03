package com.jogi.practiceproblems;

/**
 * @author Siva Srinivas jogi
 *find all missing numbers in an unsorted where entered elements is lessthan 256
 */
public class ListOfMissingNumber {
	
	public void missingElement(int[] array)
	{		
		boolean[] bool = new boolean[256];
		for(int i=0;i<array.length;i++)
		{
			bool[array[i]]=true;
		}
		for(int i=0;i<array.length;i++)
		{
			if(bool[i]==false)
			{
				System.out.println("Missing number is"+i);
			}
		}
	}

}
