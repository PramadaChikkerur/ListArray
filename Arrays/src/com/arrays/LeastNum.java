package com.arrays;

public class LeastNum {
	
	public static void main(String[] args) {
		
		int[] i2 = new int[]{63,54,45,83,92};
		
		int min = i2[0];
		
		for (int i=1; i<i2.length;i++)
		{
			if (min>i2[i])
			{
				min = i2[i];
			}
			
		}
		
		System.out.println("Smallest number is:" + min);
		
	}

}
