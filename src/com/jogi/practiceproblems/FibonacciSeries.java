package com.jogi.practiceproblems;

public class FibonacciSeries {
	
	public void fibSeries(int n)
	{
		int f1=0;
		int f2=1;
		int f3,count=2;
		System.out.print(f1+" "+f2);
		while(count<n)
		{
			f3=f1+f2;
			System.out.print(" "+f3);
			f1=f2;
			f2=f3;
			count++;
		}
	}

}
