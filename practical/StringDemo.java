package myJava;
import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter a name:");//enter a name form user..
	        String A=s.next();
	        System.out.println("Enter a name:");//enter a name form user..
	        
	        String B=s.next();
	       
	        System.out.println(A.length());//find a length..
	        System.out.println(B.length());//find a length..
	        //give a condition...
	    if(A.compareTo(B) > 0){
	        System.out.println("Yes");
	    } else {
	        System.out.println("No");
	    }
        //print a first latter in upperCase...
	    A = (A.substring(0,1)).toUpperCase() + A.substring(1);       
	    B = (B.substring(0,1)).toUpperCase() + B.substring(1);
	    System.out.println(A + " " + B);
	}

}
