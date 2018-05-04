package com;

public class Difference {

	public static void main(String[] args) {
		int sum=0,sumsq=0,diff=0,sqsum=0 ;
		for(int i=1;i<=100;i++)
		{
			sum+=i;
			sqsum+=(int)Math.pow(i,2);
			
		}
	
		sumsq=(int)Math.pow(sum, 2);
		diff= sumsq - sqsum;
		System.out.println("difference between the sum of squares of first 100 numbers and square of their sum is : "+diff);
	}

}
