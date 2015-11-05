package com.pramada.chikkerur;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.LinkedList;




public class listStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList <String> students = new LinkedList <String>();
	students.add("Student1");
	students.add("Student2");
	students.add("Student3");
	students.add("Student4");
	students.add("Student5");
	students.add("Student6");
	
	for (String s : students)
	{
	System.out.println("Students are " + s);
	
	}
	
	
//	private static void printReversedList(List<String> students)
	
		ListIterator <String> iterator = students.listIterator(students.size());
		System.out.println("Students in Reverse Order");
		{
		while (iterator.hasPrevious())
			
			System.out.println(iterator.previous());
		
	
	}
	}

  
	}
