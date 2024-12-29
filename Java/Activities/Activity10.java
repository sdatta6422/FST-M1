package hello;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("N");
        hs.add("S");
        System.out.println("Original HashSet: " + hs);
        System.out.println("Size of HashSet: " + hs.size());
        if(hs.remove("Z")) {
        	System.out.println("Z removed from the Set");
        } else {
        	System.out.println("Z is not present in the Set");
        }
        //Search for element
        System.out.println("Checking if M is present: " + hs.contains("M"));
        //Print updated HashSet
        System.out.println("Updated HashSet: " + hs);
        
	}

}
