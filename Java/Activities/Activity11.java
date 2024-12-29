package hello;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//import java.util.Map;
		//import java.util.HashMap;

		//class Main {

		  //  public static void main(String[] args) {
		        // Creating a map using the HashMap
		        Map<Integer,String> colours  = new HashMap<>();

		        // Insert elements to the map
		        colours .put(1,"Red");
		        colours .put(2,"Green");
		        colours .put(3,"Blue");
		        colours .put(4,"Pink");
		        colours .put(5,"Yellow");
		        
		        System.out.println("Map: " + colours );

		        // Access keys of the map
		        System.out.println("Keys: " + colours.keySet());

		        // Access values of the map
		        System.out.println("Values: " + colours.values());

		        // Access entries of the map
		        System.out.println("Entries: " + colours.entrySet());

		        // Remove Elements from the map
		        System.out.println("Map Size: " + colours.size());
		        String value = colours.remove(4);
		       // colours.containsValue("Green");
		        System.out.println("Removed Value: " + value);
		        System.out.println("Map: " + colours.containsValue("Green"));
		        System.out.println("Map Size After Remove: " + colours.size());
		        
		        
		    }
		

	}


