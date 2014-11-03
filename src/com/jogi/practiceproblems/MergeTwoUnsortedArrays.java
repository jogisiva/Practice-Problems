package com.jogi.practiceproblems;

import java.util.Arrays;

public class MergeTwoUnsortedArrays {
	
	public void mergeUnsorted(int[] array1,int[] array2)
	{
		Arrays.sort(array1);
		Arrays.sort(array2);
		int i=0,j=0,k=0;
		int[] result = new int[array1.length+array2.length];
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
		for(k=0;k<result.length;k++)
		{
			System.out.print(result[k]+" ");
		}
	}

}
