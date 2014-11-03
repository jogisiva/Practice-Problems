package com.jogi.practiceproblems;

public class ImplementStack {
	static int top=-1;
	public void push(int[] array, int element,int MAX_SIZE)
	{
		if(top==MAX_SIZE-1)
			System.out.println("Stact is overflow");
		else
		{
			top=top+1;
			array[top]=element;
			System.out.println("Element added "+ element);
		}
	}
	public void pop(int[] array)
	{
		if(top==-1)
			System.out.println("Stack is underflow");
		
			System.out.println("Deleted eleemnt is"+array[top]);
				top=top-1;
				
	}
	public void display(int[] array)
	{
		if(top==-1)
			System.out.println("No elements to display");
		for(int i=0;i<=top;i++)
		{
			System.out.println(array[i]+" ");
		}
	}

}
