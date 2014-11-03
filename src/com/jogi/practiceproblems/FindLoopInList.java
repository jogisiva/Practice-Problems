package com.jogi.practiceproblems;
class Node
{
	int data;
	Node link;
	public Node(int data,Node link)
	{
		this.data=data;
		this.link=link;
	}
	public int getData()
	{
		return data;
	}
	public void setData(int data)
	{
		this.data=data;
	}
	public Node getNode()
	{
		return link;
	}
	public void SetNode(Node link)
	{
		this.link=link;
	}
}

public class FindLoopInList {
	
	public boolean findLoop(Node list)
	{
		if(list==null)
			return false;
		Node slow,fast;
		slow=fast=list;
		while(true)
		{
			slow=slow.link;
			if(fast.link!=null)
			{
				fast=fast.link.link;
			}
			else
				return false;
			if(slow==null||fast==null)
				return false;
			if(slow==fast)
				return true;
		}		
	}

}
