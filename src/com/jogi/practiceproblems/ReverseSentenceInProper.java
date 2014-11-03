package com.jogi.practiceproblems;

/**
 * @author Siva Srinivas Jogi
 * Program to reverse the sentence
 * Given word is "Hello World" 
 * Output: "World Hello"
 */
public class ReverseSentenceInProper {
	
	public void reverseSentence(String str)
	{
		String[] newString = str.split("\\s+");
		for(int i=newString.length-1;i>=0;i--)
		{
			System.out.print(newString[i]+" ");
		}
		
	}

}
