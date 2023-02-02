//Write a program to design an Calculator using switch case..
import java.util.Scanner;
class SwitchCalculatorExample{
    public void cal(int a,int b,char ch){
	 
	switch(ch){
		case 'a' :
		System.out.println("Addition : "+(a+b));//perform Addition between number
		break;
		case 's' :
		System.out.println("Subtraction :"+(a-b));//perform Subtraction between number
		break;
		case 'm' :
		System.out.println("Multiplication : "+(a*b));//perform Multiplication between number
		break;
		case 'd' :
		System.out.println("Division : "+(a/b));//perform Division between number
		break;
		default:
		System.out.println("Sorry..Please try another");
	}
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter 1st number :");
      int a = sc.nextInt();
      System.out.println("Enter 2nd number :");
      int b = sc.nextInt();
	  
      System.out.println("Select : Addition-a: Subtraction-s: Multiplication-m: Division-d: ");
      char ch = sc.next().charAt(0);
	  
	  SwitchCalculatorExample se=new SwitchCalculatorExample();
	  //Classname objName=new Classname();
	  se.cal(a,b,ch);//Call Method
	}
	
}