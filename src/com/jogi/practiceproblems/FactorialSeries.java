package com.jogi.practiceproblems;

public class FactorialSeries {
	
//	public void fact(int n)
//	{
//		int result=1;
//		for(int i=1;i<=n;i++)
//		{
//		     result=result*i;
//		}
//		System.out.println(result);
//	}
	
	public int factorial(int n)
	{
		if(n!=1)			
		return n*factorial(n-1);
		return n;
	}

}
