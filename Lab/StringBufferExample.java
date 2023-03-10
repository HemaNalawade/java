package myJava;

public class StringBufferExample { //StringBufferExample class Declaration..

	public static void main(String[] args) {//Main method...
		// TODO Auto-generated method stub
     String str1="This is StringBuffer";//Declare a string..
     String result = str1.concat(" This is a sample program");//Adds the string ” This is a sample program”..
     System.out.println(result);//Display the result..
     StringBuffer str = new StringBuffer(result);//String Declaration with using object..
     System.out.println(str.insert(21, "Object "));// Insert the string “Object” into the existing string at 21st position..
     System.out.println(str.reverse());//Display reverses string.. 
     String replaceString=str1.replace("Buffer","Builder");//Replaces the word “Buffer” with “Builder”..  
     System.out.println(replaceString);//Display the replace word..
	}

}
//Output
/*This is StringBuffer This is a sample program
This is StringBuffer Object This is a sample program
margorp elpmas a si sihT tcejbO reffuBgnirtS si sihT
This is StringBuilder*/