package com.jogi.practiceproblems;

public class FindElement {
	
	public void findElement(int[] array, int element)
	{
		//Assume array is sored use binary search algorthim
		int low=0;
		int high = array.length-1;
		int mid=(low+high)/2;
		while(low<high)
		{
			if(array[mid]<element)
			{
				low=mid+1;
			}
			else if(array[mid]==element)
			{
				System.out.println("Element found at "+mid);
				break;
			}
			else
			{
				high=mid-1;
			}
			mid=(low+high)/2;
				
		}
		if(low>=high)
		{
			System.out.println("Element not found");
		}		
	}

}
