package com.jogi.practiceproblems;

public class FindElementUnsortedArray {
	
	public void findElement(int[] array, int element)
	{
		int[] finalArray = sortArray(array);
		int low=0;
		int high = finalArray.length-1;
		int mid=(low+high)/2;
		while(low<high)
		{			
			if(finalArray[mid]<element)
			{
				low=mid+1;
			}
			else if(finalArray[mid]==element)
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
	public int[] sortArray(int[] array)
	{
		//use any sorting logic here
		//bubble sort , insertion sort uses o(n2)
		//quick takes o(nlogn) and mergesort also takes o(nlogn)
//		//bubble sort logic
//		int temp;
//		for(int i=0;i<array.length-1;i++)
//		{
//			for(int j=i+1;j<array.length;j++)
//			{
//				if(array[i]>array[j])
//				{
//					temp=array[i];
//					array[i]=array[j];
//					array[j]=temp;
//				}
//			}
//		}
//		for(int i=0;i<array.length;i++)
//		{
//			System.out.print(array[i]+" ");
//		}
//		//Insertion sort logic 	
//		for(int i=1;i<array.length;i++){
//		      int j=i;
//		      int temp=array[i];
//		     while((j>0)&&(array[j-1]>temp))
//		      {
//		    	  array[j]=array[j-1];
//		    	  j--;
//		      }
//		      array[j]=temp;
//		  }
//		for(int x=0;x<array.length;x++)
//		System.out.print(array[x]+" ");
		return array ;
	}

}
