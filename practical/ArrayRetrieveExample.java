package myJava;
import java.util.*;
public class ArrayRetrieveExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Yellow");
		  list_Strings.add("Pink");
		  list_Strings.add("Orange");
		  list_Strings.add("Red");
		  list_Strings.add("Black"); 
		  System.out.println(list_Strings);
		  
		  // Retrieve the first and fourth element...
		  String element = list_Strings.get(0);
		  System.out.println("First element: "+element);
		  element = list_Strings.get(3);
		  System.out.println("Fourth element: "+element);
		  
		  // Remove the third element from the list.
		  list_Strings.remove(2);
		  System.out.println("After removing third element from the list:\n"+list_Strings);
	      
		  // Search the value Red
		    if (list_Strings.contains("Red")) {
		    System.out.println("Found the element");
		    } else {
		    System.out.println("There is no such element");
		    }
	}

}
