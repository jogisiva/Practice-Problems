package com.jogi.practiceproblems;

public class QuickSort {

	
	public void quickSort(int array[],int first,int last)
	{
		    int pivot,j,temp,i;
		     if(first<last){
		         pivot=first;
		         i=first;
		         j=last;
		         while(i<j){
		             while(array[i]<=array[pivot]&&i<last)
		                 i++;
		             while(array[j]>array[pivot])
		                 j--;
		             if(i<j){
		                 temp=array[i];
		                  array[i]=array[j];
		                  array[j]=temp;
		             }
		         }
		         temp=array[pivot];
		         array[pivot]=array[j];
		         array[j]=temp;
		         quickSort(array,first,j-1);
		         quickSort(array,j+1,last);
		    }
		}
	}

