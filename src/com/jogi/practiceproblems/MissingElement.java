package com.jogi.practiceproblems;

/**
 * @author Siva Srinivas Jogi
 * Missing element in a sorted array
 * program to find missing element from 1 to n integers
 */
public class MissingElement {
	
	public void missingElement(int[] array)
	{
		int sumArray=0;
		int missingNumber;
		int totalArray=0;
		for(int i=0;i<array.length;i++)
		{
			sumArray=sumArray+array[i];
			totalArray=totalArray+1;
		}
		totalArray=totalArray+1;
		//sum of total number series - giveNumber sum = Missing number
		totalArray=(totalArray*(totalArray+1))/2;
		missingNumber=totalArray-sumArray;
		System.out.println(missingNumber);
	}

}
