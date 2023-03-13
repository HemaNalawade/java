package myJava;
import java.util.*;
public class ArrayInsertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> String_List = new ArrayList<String>();
		String_List.add("Pink");
		String_List.add("Purple");
		  String_List.add("Blue");
		  String_List.add("White");
		  String_List.add("Black");
		  
		  System.out.println(String_List);
		  String_List.add(0, "Red");
		  String_List.add(1, "Orange");
		  String_List.add(4, "Yellow");
		  
		  System.out.println(String_List);
	}

}
