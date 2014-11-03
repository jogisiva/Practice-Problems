package com.jogi.practiceproblems;

public class ReverseString {
	
	public void reverseString(String str)
	{
		String result="";
		int length=str.length();
		for(int i=length-1;i>=0;i--)
		{
			result =result + str.charAt(i);
		}
		System.out.println(result);
	}
}
