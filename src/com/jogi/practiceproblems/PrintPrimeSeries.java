package com.jogi.practiceproblems;

/**
 * @author SivaSrinivas Jogi
 *  program to print series of primes upto the given number
 */
public class PrintPrimeSeries {
	
    private int count=0;
	public void primeSeries(int n)
	{
		if(n<2)
		{
			System.out.println("No primes\n");
			System.out.println("\nTotal primes count value "+count);
		}
		else if(n==2)
		{
			System.out.print("Prime numbers are "+ n);
			System.out.print("\nTotal primes count value is "+(++count));
		}
		else
		{
			for(int i=2;i<=n;i++)
			{
				boolean flag=isPrime(i);
				if(flag)
				{
					count=count+1;
					System.out.print(" "+i);
				}
			}
			System.out.println("\nTotal prime count values "+count);
		}
		count=0;
	}
	public boolean isPrime(int num)
	{
		boolean flag=true;
		for(int j=2;j<=num/2;j++)
		{
			if(num%j==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}
