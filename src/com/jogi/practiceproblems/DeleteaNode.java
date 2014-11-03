package com.jogi.practiceproblems;


public class DeleteaNode {
	
	// added final, change input to `searchValue`
	public boolean delete(Node list,final int searchValue) {	  
	    Node prevNode = null;
	    Node curNode = list;
	    boolean deletedANode = false;

	    /*
	    This code is redundant, the while-loop does the same effective thing.
	    if (head == null) {
	        return deletedANode;
	    }
	    */
	    while (curNode != null) {
	        if (curNode.data == searchValue) {
	            if (curNode == list) {
	                list = list.link;
	            } else { // fixed indenting/newline
	                prevNode.link = curNode.link;
	            }
	            // fixed indenting
	            deletedANode = true;
	         } else {
	             // only advance the prevNode when there's no match.
	             prevNode = curNode;
	         }
	        curNode = curNode.link;
	    }

	    return deletedANode;
	}
}
