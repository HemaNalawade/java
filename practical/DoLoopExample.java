import java.util.Scanner;
class DoLoopExample{
    public void table(int num){
	    
		int i=1;
		do{
		System.out.println(num+ "*" +i+ "=" +num*i);
		i++;
		}
		while(i<=10);
		
	}
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		DoLoopExample se=new DoLoopExample();
		    se.table(num);
		
	}
}