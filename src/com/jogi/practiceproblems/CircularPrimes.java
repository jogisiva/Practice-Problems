package com.jogi.practiceproblems;

public class CircularPrimes {
	private int prime_count;
	private int circular_prime_count;
	public void circularPrime(int n)
	{
		for(int i=1;i<n;i++)
		{
			if(isPrime(i))
			{
				prime_count++;
				
				String num = i+"";
				String temp=num;
				boolean flag=false;
				for(int j=0;j<num.length();j++)
				{
				  temp=temp.substring(temp.length()-1,temp.length())+temp;
				  temp=temp.substring(0, temp.length()-1);
				  if(!isPrime(Integer.parseInt(temp)))
				  {
					  flag=false;
					  break;
				  }
				  else
				  {
					  flag=true;
				  }
				  if(flag)
				  {
					  circular_prime_count++;
				  }
				}				
			}
		}
		System.out.println("Prime number count "+ prime_count);
		System.out.println("Circular prime numbers count "+ circular_prime_count);
	}
	public boolean isPrime(int num)
	{
		if(num<2)
			return false;
		else if(num==2)
			return true;
		else
		{
			 for(int j=2;j<=num/2;j++)
			 {
				 if(num%j==0)
				 {
					 return false;
				 }
			 }
		}
		return true;
	}

}
