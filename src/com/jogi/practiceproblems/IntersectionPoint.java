package com.jogi.practiceproblems;


public class IntersectionPoint {
	
//	public void intersectionPoint(int[] array1,int[] array2)
//	{//o(n)
//		HashSet<Integer> hs = new HashSet<Integer>();
//		for(int i:array1)
//		{
//			if(hs.contains(i))
//			{
//				System.out.println("Intersection dected at :"+i);
//				break;
//			}
//			else
//			{
//				hs.add(i);
//			}
//		}
//		for(int i:array2)
//		{
//			if(hs.contains(i))
//			{
//				System.out.println("Intersection dected at :"+i);
//				break;
//			}
//			else
//			{
//				hs.add(i);
//			}
//		}
		
//	}
	public void intersectionPoint(int[] array1,int[] array2)
	{//o(m+n) complexity
		int i=0,j=0;
		while(i<array1.length&&j<array2.length)
		{
			if(array1[i]<array2[j])
			{
				i++;
			}
			else if(array1[i]>array2[j])
			{
				j++;
			}
			else
			{
				System.out.println("Intersect point is :"+array2[j]);
				i++;j++;
			}
				
		}
	}
}
