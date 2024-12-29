package hello;

import java.util.ArrayList;
import java.util.Arrays;

public class Activity9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> myList=new ArrayList<String>();
		//myList.add("Asmita","Sumita","Sam","Tom","Dick");
		myList.addAll(Arrays.asList("Asmita","Sumita","Sam","Tom","Dick"));	
		
		
		for (String number:myList)
		{
			 System.out.println("print all the names"+" "+number);
		}
		//myList.get(2);
		System.out.println("to retrieve the 3rd name in the ArrayList"+"  "+myList.get(2));
		System.out.println(myList.size());
		 System.out.println("to check if a name exists in the ArrayList"+" "+myList.contains("Tom"));
		//myList.size();
		 
		 System.out.println("to print the number of names in the ArrayList"+"  "+myList.size());
		
		myList.remove("Dick");
		
		System.out.println("to print the number of names in the ArrayList after remove"+"  "+myList.size());
		
		
		}
	

	}


