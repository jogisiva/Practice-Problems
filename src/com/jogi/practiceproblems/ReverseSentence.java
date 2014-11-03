package com.jogi.practiceproblems;

public class ReverseSentence {
	
	public void reverseSentene(String str)
	{
		String result="";
		for(int i=str.length()-1;i>=0;i--)
		{
			result=result+str.charAt(i);
		}
		System.out.println(result);
	}

}
