package com.jogi.practiceproblems;

import java.util.HashMap;


public class DuplicateValueInUnSortedArray {
	
	public void duplicateValue(int[] array)
	{
//		int i=0;
//		while(i<array.length-1)
//		{
//			for(int j=1;j<array.length;j++)
//			{
//				if(array[i]==array[j]&&i!=j)
//				{
//					System.out.print(array[i]+" ");
//				}
//			}
//			i++;
//		}
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i:array)
		{
			if(map.containsKey(i))
			{
				System.out.println(map.get(i));
			}
			else
			{
				map.put(i, i);
			}
		}
	}

}
