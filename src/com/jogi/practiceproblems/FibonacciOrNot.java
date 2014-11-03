package com.jogi.practiceproblems;

public class FibonacciOrNot {
	
	public void findfib(int n)
	{
		int f1=0;
		int f2=1;
		int f3;
		boolean flag=false;
		for(int i=0;i<=n;i++)
		{
			f3=f1+f2;
			f1=f2;
			f2=f3;	
			if(f3==n)
			{
				flag=true;
			}
		}
		if(flag)
		{
			System.out.println("Number is fibonacci");
		}
		else
		{
			System.out.println("Number is not fibonacci");
		}
		
	}

}
