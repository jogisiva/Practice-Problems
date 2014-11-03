package com.jogi.practiceproblems;

public class MergeTwoSortedArrays {
	
	public void mergedArray(int[] array1,int[] array2)
	{
		int length=array1.length+array2.length;
		int[] result= new int[length];
		int i=0,j=0,k=0;
		while(i<array1.length&&j<array2.length)
		{
			if(array1[i]<array2[j])
			{
				result[k]=array1[i];
				k++;i++;
			}
			else
			{
				result[k]=array2[j];
				k++;j++;
			}
		}
		while(i<array1.length)
		{
			result[k]=array1[i];
			k++;i++;
		}
		while(j<array2.length)
		{
			result[k]=array2[j];
			k++;j++;
		}
		for(k=0;k<length;k++)
		{
			System.out.print(result[k]+"  ");
		}
		
	}

}
