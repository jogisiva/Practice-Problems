package com.jogi.practiceproblems;

public class ImplementQuickSort {
	/**
	 * Recursive quicksort logic
	 * @param a input array
	 * @param i start index of the array
	 * @param j end index of the array
	 */
	public void recursiveQuickSort(int[] a, int i, int j) {
	    // Handle logic to divide the array
	    int idx = partition(a, i, j);
	     
	    // Recursively call quick sort with left part of the divided array
	    if(i<idx-1) {
	        recursiveQuickSort(a, i, idx-1);
	    }
	     
	    // Recursively call quick sort with right part of the divided array
	    if(j>idx) {
	        recursiveQuickSort(a, idx, j);
	    }
	}
	public int partition(int[] a, int left, int right) {
	    // Get the pivot element
	    int pivot = a[left];
	     
	    // Break when left is > right
	    while(left <= right) {
	        //increment the lower bound till you find the element more than the pivot
	        while(a[left]<pivot)
	            left++;
	        //decrement the upper bound till you find the element less than the pivot
	        while(a[right]>pivot)
	            right--;
	         
	        // swap the values which are left by lower and upper bounds 
	        if(left <= right) {
	            int tmp = a[left];
	            a[left] = a[right];
	            a[right] = tmp;
	             
	            //increment left index and decrement right index
	            left++;
	            right--;
	        }
	    }   
	    return left;
	}
}
