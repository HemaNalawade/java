import java.util.Scanner;

class Else_If{
	
	public void calc(int marks){
		
		if((marks >= 85)&&(marks <= 100)){
			System.out.println("Grade 'O'");
		}
		else if((marks >= 75) && (marks <=84)){
			System.out.println("Grade 'A++'");
		}
		else if((marks >= 56) && (marks <=74)){
			System.out.println("Grade 'A'");
		}
		else if((marks <= 55) && (marks >= 45)){
			System.out.println("Grade 'B'");
		}
		else if((marks <= 44) && (marks >= 35)){
			System.out.println("Grade 'C'");
		}
		else if((marks <= 34) && (marks >= 0)){
			System.out.println("Failed!!!");
		}
		else{
			System.out.println("Wrong input");
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		int marks = sc.nextInt();
		
		Else_If m = new Else_If();
		m.calc(marks);
	}
}