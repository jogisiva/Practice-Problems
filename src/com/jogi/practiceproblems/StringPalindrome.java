package com.jogi.practiceproblems;

public class StringPalindrome {
	
	public void stringPlan(String str)
	{
		String reverse="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			reverse = reverse +str.charAt(i);
		}		
		if(str.equals(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
