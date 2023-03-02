package myJava;
import java.util.Scanner;//import a package..

public class ScannerLaptopDemo {//create a class ScannerLaptopDemo...

	public static void main(String[] args) {// Defines the main method...
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in); // creates an object of Scanner..
	        int choice;            //Create a choice variable..
	        while(true){                     // using loop create a given menu...
	            System.out.println("Display Main Menu\n"); //print a Display Main Menu..
	            System.out.print("1. Addition.\n");
	            System.out.print("2. Subtraction.\n");
	            System.out.print("3. Multiplication.\n");
	            System.out.print("4. Even and Odd.\n");
	            System.out.print("5. Quit.\n");
	            System.out.print("\nEnter Your Menu Choice: ");//print Enter Your Menu Choice select the choice..

	            choice = input.nextInt(); // takes input from the keyboard..
	         
	        switch(choice) {// using a switch case statement...
	        
	            //-------ADDITION------//
	        case 1://user choose a option 3 then enter a two number and perform Addition..
	        	System.out.println("Enter two numbers to be added.");
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("Enter a First Number :");
	    		int num1=sc.nextInt(); //takes input from the keyboard.
	    		System.out.println("Enter a Second Number :");
	    		int num2=sc.nextInt();//takes input from the keyboard..
	    		int addResult=num1+num2;
	    		System.out.println("Addition Result:"+addResult);//Display the AdditionResult..
	    		break;
	    		
	    		//-------SUBTRACION------//
	        case 2://user choose a option 3 then enter a two number and perform Subtraction..
	        	System.out.println("Enter two numbers to be added:");
	    		Scanner s=new Scanner(System.in);
	    		System.out.println("Enter a First Number :");
	    		int num3=s.nextInt();        //takes input from the keyboard...
	    		System.out.println("Enter a Second Number :");
	    		int num4=s.nextInt();       //takes input from the keyboard.
	    		int subResult=num3-num4;
	    		System.out.println("Subtraction Result:"+subResult);// Display the SubtractionResult.
	    		break;
	    		
	    		//-------MULTIPLICATION------//
	        case 3://user choose a option 3 then enter a two number and perform Multiplication..
	        	System.out.println("Enter two numbers to be added:");
	    		Scanner m=new Scanner(System.in);
	    		System.out.println("Enter a First Number :");
	    		int num5=m.nextInt();          //takes input from the keyboard.
	    		System.out.println("Enter a Second Number :");
	    		int num6=m.nextInt();          //takes input from the keyboard..
	    		int mulResult=num5-num6;
	    		System.out.println("Multiplication Result:"+mulResult);//Display the MultiplicationResult.
	    		break;
	    		
	    		//-------Even and Odd------//
	        case 4://user choose a option 4 then enter a number an perform a number even or odd..
	        	 Scanner eo = new Scanner(System.in);
	             System.out.print("Enter a Number: ");
	             int num = eo.nextInt(); //takes input from the keyboard..
	             if(num % 2 == 0)
	                 System.out.println(num + " is even");//if number is even print if block statement..
	             else
	                 System.out.println(num + " is odd");//if number is odd print else block statement..
	    		break;	
	        case 5://user choose a option 5 then display a quit..
	        	System.out.println("Quit");
	        	break;
	        default :
	             System.out.println("Invalid Option");
	             break;
	        } 
	     
	       
	}
	}
}
