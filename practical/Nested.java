import java.util.Scanner;
public class Nested{
	public void Age(int x){ //non static method
		
		
		if (x < 18){
			System.out.println("You are not eligible to work");
		}
		else{
			if (x>=18 && x<=60){
				System.out.println("You are eligible to work");
			}
			else {
				System.out.println("U can't work as per government rule");
			}
		}
	}
		public static void main(String args[]){
			Scanner s=new Scanner(System.in);
            System.out.println("Enter a Age:");
            int x=s.nextInt();
   

    
			Nested nc = new Nested();
			nc.Age(x);
		}
	
}