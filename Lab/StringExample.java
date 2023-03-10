package myJava;

public class StringExample {//Define a String Example Class..

	public static void main(String[] args) {//Define a main method..
		// TODO Auto-generated method stub
     String str1="Welcome to Java World";//create a String..
     System.out.println(str1);//Display the string..
     char ch=str1.charAt(5);//Define the character at 5th position..
     System.out.println(ch);//Display the character at 5th position.
     String str2="Welcome";//Create a new String..
     int result = str1.compareToIgnoreCase(str2);// Compare the two strings..
     System.out.println(result);//print result..
     String str3=" Let us learn ";//Create a new String..
     System.out.println(str1.concat(str3)); // Concatenate the two strings together..
     System.out.println(str1.indexOf("a")); //Returns the position of the first occurrence of character ‘a’..
     System.out.println(str1.replace('a','e')); //replaces all occurrences of 'a' to 'e'...  
     System.out.println(str1.substring(4, 10)); //index 4 and ending at index 10.. 
     System.out.println(str1.toLowerCase());  //Define a LowerCase of the String. 
	}

	
}
//Output
/*Welcome to Java World
m
14
Welcome to Java World Let us learn 
12
Welcome to Jeve World
ome to
welcome to java world*/
