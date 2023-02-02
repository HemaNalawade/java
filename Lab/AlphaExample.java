//Write a program to print Left down alphabet triangle pattern using loop.
import java.util.Scanner;
class AlphaExample{
    public void cal(int n){
	   for(int i=1;i<=n;i++)//for(initialization;condition;inc/dec)
    		{
        		for(int j=1;j<=n-i+1;j++)
        		{
            			System.out.print((char)(j+64));
        		} 
        		System.out.println("");
    		}
	}
	public static void main(String args[]){
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of lines");
 	   int n=sc.nextInt();
	   
	   AlphaExample a=new AlphaExample();
	   // classname objname=new classname();
	   a.cal(n);
	}
	
}