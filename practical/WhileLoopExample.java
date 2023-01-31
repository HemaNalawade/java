import java.util.Scanner;
class WhileLoopExample{
    public void table(int num){
	    
		int i=1;
		while(i<=10)
		{
		System.out.println(num+ "*" +i+ "=" +num*i);
		i++;
		}
	}
	
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		WhileLoopExample se=new WhileLoopExample();
		    se.table(num);
		
	}
}