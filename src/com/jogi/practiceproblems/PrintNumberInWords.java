package com.jogi.practiceproblems;

/**
 * @author Siva Srinivas Jogi
 * Porgram to print number in words
 * 123 should print as one hundred twenty three
 */
public class PrintNumberInWords {
	
	public static boolean helperConvert(int num,String[] result)
	{
		String[] strones ={ 
			"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
          };
		String[] strtens={
				"Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty",
	              "Seventy", "Eighty", "Ninety", "Hundred"
		};
		result[0]="";
		int singles,tens,hundreds;
		if(num>1000)
		{
			return false;
		}
		hundreds = num/100;
		num=num-hundreds*100;
		if(num<20)
		{
			tens=0;//special case
			singles=num;
		}
		else
		{
			tens=num/10;
			num=num-tens*10;
			singles=num;			
		}
		if(hundreds>0)
		{
			result[0]=result[0]+strones[hundreds-1];
			result[0]=result[0]+"Hundred";
		}
		if(tens>0)
		{
			result[0]=result[0]+strtens[tens-1];
			result[0]=result[0]+" ";
		}
		if(singles>0)
		{
			result[0]=result[0]+strones[singles-1];
			result[0]=result[0]+" ";
		}
		return true;
	}
	public boolean ConvertNumberToText(int num,String[] result)
	{
		String[] tempString = new String[1];
		tempString[0]="";
		int thousands;
		int temp;
		result[0]="";
		if(num<0||num>100000)
		{
			System.out.println("Not support number");
			return false;
		}
		if(num==0)
		{
			System.out.println(num + " Zero");
		}
		if(num<1000)
		{
			helperConvert(num, tempString);
			result[0]=result[0]+tempString[0];
		}
		else
		{
			thousands=num/1000;
			temp=num-thousands*1000;
			helperConvert(thousands,tempString);
			result[0]=result[0]+tempString[0];
			result[0]=result[0]+"Thousand";
			helperConvert(temp, tempString);
			result[0]=result[0]+tempString[0];
		}
		return true;		
	}
	
	
}
