import java.util.Scanner;
class ForLoopExample{
    public void tableExample(int num){
	    for(int i=1;i<=10;i++){
		System.out.println(num+ "*" +i+ "=" +num*i);
	}
	}
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		ForLoopExample se=new ForLoopExample();
		    se.tableExample(num);
		
	}
}