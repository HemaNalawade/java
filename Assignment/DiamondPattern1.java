 //Write a program to print an diamond star pattern using loop
import java.util.Scanner;  
class DiamondPattern1{
    public void cal(int r)//create method 
	{
		for(int i=0;i<=r;i++)//for(initialization;condition;inc/dec)
		{
			for(int j=1;j<=r-i;j++){
			System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.print("\n");
			}
			for(int i=r-1;i>=1;i--)
			{
				for(int j=1;j<=r-i;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=2*i-1;j++){
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
		public static void main(String args[]){
			System.out.print("Input number of rows : ");
            Scanner in = new Scanner(System.in);
		    int r = in.nextInt();
						
		    DiamondPattern1 d=new DiamondPattern1();
		   // classname objname=new classname();
		    d.cal(r);//call method
	}
}