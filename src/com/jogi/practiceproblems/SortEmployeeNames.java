package com.jogi.practiceproblems;


public class SortEmployeeNames {
	
	public void employeeSort(String[] names)
	{
//		String temp;
//		for(int i=0;i<names.length-1;i++)
//		{
//			for(int j=i+1;j<names.length;j++)
//			{
//				if(names[i].charAt(i)<names[j].charAt(j-1))
//				{
//					temp=names[i];
//					names[i]=names[j];
//					names[j]=temp;					
//				}
//			}
//		}	
		//using comparteTo method
//		for(int i=0;i<names.length-1;i++)
//		{
//			names[i].compareTo(names[i+1]);
//		}
		
		for(int i=0;i<names.length;i++)
			System.out.println(names[i]+" ");
	}
	
}
