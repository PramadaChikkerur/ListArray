package com.pram.chik;

import java.util.ArrayList;
import java.util.Iterator;


public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Name1");
		names.add("Name2");
		names.add("Name3");
		names.add("Name4");
		names.add("Name5");
		names.add("Name6");
		
		for (String n : names)
		{
			System.out.println("List is "+n);
		}
		
		Iterator<String> it = names.iterator();
		
		while(it.hasNext())
		
		{
			System.out.println(it.next());
			
			
		
		}
		

	}









	

		
		
		
		
	}

