package com.jogi.practiceproblems;

import java.util.HashMap;

public class SmallestMissingPositive {
	
	public int firstMissingPositive(int[] A) {
        int minVal=0;
        if(A.length==0){
            return 1;
        }
//        Hashtable<Integer, Integer> myTable = new Hashtable<Integer, Integer>();
          HashMap<Integer, Integer> myTable = new HashMap<Integer, Integer>();
        for(int i : A){
               if(i<minVal && i>0){
                minVal = i;
            }
            myTable.put(i, i);
        }
        for(int i=0; i<=A.length; i++){
           if( (!myTable.containsKey(minVal-1)) && minVal-1>0){
                return minVal-1;
            }
            else if(!myTable.containsKey(minVal+1)){
                return minVal+1;
            }
            minVal++;
        }
        return minVal;
    }
}
